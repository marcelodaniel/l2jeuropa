/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package lineage2.gameserver.skills.effects;

import lineage2.gameserver.geodata.GeoEngine;
import lineage2.gameserver.model.Effect;
import lineage2.gameserver.network.serverpackets.FlyToLocation;
import lineage2.gameserver.network.serverpackets.FlyToLocation.FlyType;
import lineage2.gameserver.network.serverpackets.ValidateLocation;
import lineage2.gameserver.stats.Env;
import lineage2.gameserver.utils.Location;

/**
 * @author Mobius
 * @version $Revision: 1.0 $
 */
public class EffectKnockDown extends Effect
{
	/**
	 * Field _z. Field _y. Field _x.
	 */
	private int _x, _y, _z;
	
	/**
	 * Constructor for EffectKnockDown.
	 * @param env Env
	 * @param template EffectTemplate
	 */
	public EffectKnockDown(Env env, EffectTemplate template)
	{
		super(env, template);
	}
	
	/**
	 * Method onStart.
	 */
	@Override
	public void onStart()
	{
		super.onStart();
		Location playerLoc = _effected.getLoc();
		Location tagetLoc = getEffector().getLoc();
		double distance = playerLoc.distance(tagetLoc);
		if ((distance > 2000) || (distance < 1))
		{
			return;
		}
		double dx = tagetLoc.x - playerLoc.x;
		double dy = tagetLoc.y - playerLoc.y;
		double dz = tagetLoc.z - playerLoc.z;
		int offset = Math.min((int) distance + getSkill().getFlyRadius(), 1400);
		offset = (int) (offset + Math.abs(dz));
		if (offset < 5)
		{
			offset = 5;
		}
		double sin = dy / distance;
		double cos = dx / distance;
		_x = (tagetLoc.x - (int) (offset * cos));
		_y = (tagetLoc.y - (int) (offset * sin));
		_z = tagetLoc.z;
		
		Location loc = new Location(_x, _y, _z);
		loc = GeoEngine.moveCheck(tagetLoc.x, tagetLoc.y, tagetLoc.z, _x, _y, _effected.getGeoIndex());

		_effected.startKnockDown();
		_effected.broadcastPacket(new FlyToLocation(_effected, loc, FlyType.PUSH_DOWN_HORIZONTAL, getSkill().getFlySpeed()));
		_effected.setXYZ(loc.getX(), loc.getY(), loc.getZ());
		_effected.broadcastPacket(new ValidateLocation(_effected));
	}
	
	/**
	 * Method onExit.
	 */
	@Override
	public void onExit()
	{
		super.onExit();
		_effected.setXYZ(_x, _y, _z);
		_effected.broadcastPacket(new ValidateLocation(_effected));
		_effected.stopKnockDown(true);
	}
	
	/**
	 * Method onActionTime.
	 * @return boolean
	 */
	@Override
	public boolean onActionTime()
	{
		return false;
	}
}
