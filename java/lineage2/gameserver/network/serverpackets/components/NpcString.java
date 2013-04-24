package lineage2.gameserver.network.serverpackets.components;

import java.util.NoSuchElementException;

/**
 * @author VISTALL
 * @date 15:13/28.12.2010
 */
public enum NpcString
{
	NONE(-1), NONE2(2042),
	// Text: The radio signal detector is responding. # A suspicious pile of
	// stones catches your eye.
	THE_RADIO_SIGNAL_DETECTOR_IS_RESPONDING_A_SUSPICIOUS_PILE_OF_STONES_CATCHES_YOUR_EYE(11453),
	// Text: Att... attack... $s1. Ro... rogue... $s2..
	ATT__ATTACK__S1__RO__ROGUE__S2(46350),
	// Text: Listen, you villagers. Our liege, who will soon become a lord, has
	// defeated the Headless Knight. You can now rest easy!
	LISTEN_YOU_VILLAGERS_OUR_LIEGE_WHO_WILL_SOON_BECAME_A_LORD_HAS_DEFEATED_THE_HEADLESS_KNIGHT(70854),
	// $s1 has become lord of the Town of Gludio. Long may he reign!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_GLUDIO(70859),
	// Text: $s1 has become lord of the Town of Dion. Long may he reign!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_DION(70959),
	// Text: $s1 has become the lord of the Town of Giran. May there be glory in
	// the territory of Giran!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_GIRAN(71059),
	// Text: $s1 has become the lord of the Town of Oren. May there be glory in
	// the territory of Oren!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_OREN(71259),
	// Text: $s1 has become the lord of the Town of Aden. May there be glory in
	// the territory of Aden!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_ADEN(71351),
	// Text: $s1 has become the lord of the Town of Schuttgart. May there be
	// glory in the territory of Schuttgart!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_SCHUTTGART(71459),
	// Text: $s1 has become the lord of the Town of Innadril. May there be glory
	// in the territory of Innadril!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_INNADRIL(71159),
	// Text: $s1 has become the lord of the Town of Rune. May there be glory in
	// the territory of Rune!
	S1_HAS_BECOME_THE_LORD_OF_THE_TOWN_OF_RUNE(71659),
	// Text: Protect the catapult of Gludio!
	PROTECT_THE_CATAPULT_OF_GLUDIO(72951),
	// Text: Protect the catapult of Dion!
	PROTECT_THE_CATAPULT_OF_DION(72952),
	// Text: Protect the catapult of Giran!
	PROTECT_THE_CATAPULT_OF_GIRAN(72953),
	// Text: Protect the catapult of Oren!
	PROTECT_THE_CATAPULT_OF_OREN(72954),
	// Text: Protect the catapult of Aden!
	PROTECT_THE_CATAPULT_OF_ADEN(72955),
	// Text: Protect the catapult of Innadril!
	PROTECT_THE_CATAPULT_OF_INNADRIL(72956),
	// Text: Protect the catapult of Goddard!
	PROTECT_THE_CATAPULT_OF_GODDARD(72957),
	// Text: Protect the catapult of Rune!
	PROTECT_THE_CATAPULT_OF_RUNE(72958),
	// Text: Protect the catapult of Schuttgart!
	PROTECT_THE_CATAPULT_OF_SCHUTTGART(72959),
	// Text: The catapult of Gludio has been destroyed!
	THE_CATAPULT_OF_GLUDIO_HAS_BEEN_DESTROYED(72961),
	// Text: The catapult of Dion has been destroyed!
	THE_CATAPULT_OF_DION_HAS_BEEN_DESTROYED(72962),
	// Text: The catapult of Giran has been destroyed!
	THE_CATAPULT_OF_GIRAN_HAS_BEEN_DESTROYED(72963),
	// Text: The catapult of Oren has been destroyed!
	THE_CATAPULT_OF_OREN_HAS_BEEN_DESTROYED(72964),
	// Text: The catapult of Aden has been destroyed!
	THE_CATAPULT_OF_ADEN_HAS_BEEN_DESTROYED(72965),
	// Text: The catapult of Innadril has been destroyed!
	THE_CATAPULT_OF_INNADRIL_HAS_BEEN_DESTROYED(72966),
	// Text: The catapult of Goddard has been destroyed!
	THE_CATAPULT_OF_GODDARD_HAS_BEEN_DESTROYED(72967),
	// Text: The catapult of Rune has been destroyed!
	THE_CATAPULT_OF_RUNE_HAS_BEEN_DESTROYED(72968),
	// Text: The catapult of Schuttgart has been destroyed!
	THE_CATAPULT_OF_SCHUTTGART_HAS_BEEN_DESTROYED(72969),
	// Text: Protect the supplies safe of Gludio!
	PROTECT_THE_SUPPLIES_SAFE_OF_GLUDIO(73051),
	// Text: Protect the supplies safe of Dion!
	PROTECT_THE_SUPPLIES_SAFE_OF_DION(73052),
	// Text: Protect the supplies safe of Giran!
	PROTECT_THE_SUPPLIES_SAFE_OF_GIRAN(73053),
	// Text: Protect the supplies safe of Oren!
	PROTECT_THE_SUPPLIES_SAFE_OF_OREN(73054),
	// Text: Protect the supplies safe of Aden!
	PROTECT_THE_SUPPLIES_SAFE_OF_ADEN(73055),
	// Text: Protect the supplies safe of Innadril!
	PROTECT_THE_SUPPLIES_SAFE_OF_INNADRIL(73056),
	// Text: Protect the supplies safe of Goddard!
	PROTECT_THE_SUPPLIES_SAFE_OF_GODDARD(73057),
	// Text: Protect the supplies safe of Rune!
	PROTECT_THE_SUPPLIES_SAFE_OF_RUNE(73058),
	// Text: Protect the supplies safe of Schuttgart!
	PROTECT_THE_SUPPLIES_SAFE_OF_SCHUTTGART(73059),
	// Text: The supplies safe of Gludio has been destroyed!
	THE_SUPPLIES_SAFE_OF_GLUDIO_HAS_BEEN_DESTROYED(73061),
	// Text: The supplies safe of Dion has been destroyed!
	THE_SUPPLIES_SAFE_OF_DION_HAS_BEEN_DESTROYED(73062),
	// Text: The supplies safe of Giran has been destroyed!
	THE_SUPPLIES_SAFE_OF_GIRAN_HAS_BEEN_DESTROYED(73063),
	// Text: The supplies safe of Oren has been destroyed!
	THE_SUPPLIES_SAFE_OF_OREN_HAS_BEEN_DESTROYED(73064),
	// Text: The supplies safe of Aden has been destroyed!
	THE_SUPPLIES_SAFE_OF_ADEN_HAS_BEEN_DESTROYED(73065),
	// Text: The supplies safe of Innadril has been destroyed!
	THE_SUPPLIES_SAFE_OF_INNADRIL_HAS_BEEN_DESTROYED(73066),
	// Text: The supplies safe of Goddard has been destroyed!
	THE_SUPPLIES_SAFE_OF_GODDARD_HAS_BEEN_DESTROYED(73067),
	// Text: The supplies safe of Rune has been destroyed!
	THE_SUPPLIES_SAFE_OF_RUNE_HAS_BEEN_DESTROYED(73068),
	// Text: The supplies safe of Schuttgart has been destroyed!
	THE_SUPPLIES_SAFE_OF_SCHUTTGART_HAS_BEEN_DESTROYED(73069),
	// Text: Protect the Military Association Leader of Gludio!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_GLUDIO(73151),
	// Text: Protect the Military Association Leader of Dion!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_DION(73152),
	// Text: Protect the Military Association Leader of Giran!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_GIRAN(73153),
	// Text: Protect the Military Association Leader of Oren!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_OREN(73154),
	// Text: Protect the Military Association Leader of Aden!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_ADEN(73155),
	// Text: Protect the Military Association Leader of Innadril!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_INNADRIL(73156),
	// Text: Protect the Military Association Leader of Goddard!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_GODDARD(73157),
	// Text: Protect the Military Association Leader of Rune!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_RUNE(73158),
	// Text: Protect the Military Association Leader of Schuttgart!
	PROTECT_THE_MILITARY_ASSOCIATION_LEADER_OF_SCHUTTGART(73159),
	// Text: The Military Association Leader of Gludio is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_GLUDIO_IS_DEAD(73161),
	// Text: The Military Association Leader of Dion is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_DION_IS_DEAD(73162),
	// Text: The Military Association Leader of Giran is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_GIRAN_IS_DEAD(73163),
	// Text: The Military Association Leader of Oren is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_OREN_IS_DEAD(73164),
	// Text: The Military Association Leader of Aden is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_ADEN_IS_DEAD(73165),
	// Text: The Military Association Leader of Innadril is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_INNADRIL_IS_DEAD(73166),
	// Text: The Military Association Leader of Goddard is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_GODDARD_IS_DEAD(73167),
	// Text: The Military Association Leader of Rune is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_RUNE_IS_DEAD(73168),
	// Text: The Military Association Leader of Schuttgart is dead!
	THE_MILITARY_ASSOCIATION_LEADER_OF_SCHUTTGART_IS_DEAD(73169),
	// Text: Protect the Religious Association Leader of Gludio!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GLUDIO(73251),
	// Text: Protect the Religious Association Leader of Dion!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_DION(73252),
	// Text: Protect the Religious Association Leader of Giran!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GIRAN(73253),
	// Text: Protect the Religious Association Leader of Oren!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_OREN(73254),
	// Text: Protect the Religious Association Leader of Aden!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_ADEN(73255),
	// Text: Protect the Religious Association Leader of Innadril!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_INNADRIL(73256),
	// Text: Protect the Religious Association Leader of Goddard!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GODDARD(73257),
	// Text: Protect the Religious Association Leader of Rune!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_RUNE(73258),
	// Text: Protect the Religious Association Leader of Schuttgart!
	PROTECT_THE_RELIGIOUS_ASSOCIATION_LEADER_OF_SCHUTTGART(73259),
	// Text: The Religious Association Leader of Gludio is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GLUDIO_IS_DEAD(73261),
	// Text: The Religious Association Leader of Dion is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_DION_IS_DEAD(73262),
	// Text: The Religious Association Leader of Giran is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GIRAN_IS_DEAD(73263),
	// Text: The Religious Association Leader of Oren is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_OREN_IS_DEAD(73264),
	// Text: The Religious Association Leader of Aden is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_ADEN_IS_DEAD(73265),
	// Text: The Religious Association Leader of Innadril is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_INNADRIL_IS_DEAD(73266),
	// Text: The Religious Association Leader of Goddard is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_GODDARD_IS_DEAD(73267),
	// Text: The Religious Association Leader of Rune is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_RUNE_IS_DEAD(73268),
	// Text: The Religious Association Leader of Schuttgart is dead!
	THE_RELIGIOUS_ASSOCIATION_LEADER_OF_SCHUTTGART_IS_DEAD(73269),
	// Text: Protect the Economic Association Leader of Gludio!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_GLUDIO(73351),
	// Text: Protect the Economic Association Leader of Dion!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_DION(73352),
	// Text: Protect the Economic Association Leader of Giran!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_GIRAN(73353),
	// Text: Protect the Economic Association Leader of Oren!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_OREN(73354),
	// Text: Protect the Economic Association Leader of Aden!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_ADEN(73355),
	// Text: Protect the Economic Association Leader of Innadril!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_INNADRIL(73356),
	// Text: Protect the Economic Association Leader of Goddard!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_GODDARD(73357),
	// Text: Protect the Economic Association Leader of Rune!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_RUNE(73358),
	// Text: Protect the Economic Association Leader of Schuttgart!
	PROTECT_THE_ECONOMIC_ASSOCIATION_LEADER_OF_SCHUTTGART(73359),
	// Text: The Economic Association Leader of Gludio is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_GLUDIO_IS_DEAD(73361),
	// Text: The Economic Association Leader of Dion is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_DION_IS_DEAD(73362),
	// Text: The Economic Association Leader of Giran is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_GIRAN_IS_DEAD(73363),
	// Text: The Economic Association Leader of Oren is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_OREN_IS_DEAD(73364),
	// Text: The Economic Association Leader of Aden is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_ADEN_IS_DEAD(73365),
	// Text: The Economic Association Leader of Innadril is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_INNADRIL_IS_DEAD(73366),
	// Text: The Economic Association Leader of Goddard is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_GODDARD_IS_DEAD(73367),
	// Text: The Economic Association Leader of Rune is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_RUNE_IS_DEAD(73368),
	// Text: The Economic Association Leader of Schuttgart is dead!
	THE_ECONOMIC_ASSOCIATION_LEADER_OF_SCHUTTGART_IS_DEAD(73369),
	// Text: Defeat $s1 enemy knights!
	DEFEAT_S1_ENEMY_KNIGHTS(73451),
	// Text: You have defeated $s2 of $s1 knights.
	YOU_HAVE_DEFEATED_S2_OF_S1_KNIGHTS(73461),
	// Text: You weakened the enemy's defense!
	YOU_WEAKENED_THE_ENEMYS_DEFENSE(73462),
	// Text: Defeat $s1 warriors and rogues!
	DEFEAT_S1_WARRIORS_AND_ROGUES(73551),
	// Text: You have defeated $s2 of $s1 warriors and rogues.
	YOU_HAVE_DEFEATED_S2_OF_S1_WARRIORS_AND_ROGUES(73561),
	// Text: You weakened the enemy's attack!
	YOU_WEAKENED_THE_ENEMYS_ATTACK(73562),
	// Text: Defeat $s1 wizards and summoners!
	DEFEAT_S1_WIZARDS_AND_SUMMONERS(73651),
	// Text: You have defeated $s2 of $s1 enemies.
	YOU_HAVE_DEFEATED_S2_OF_S1_ENEMIES(73661),
	// Text: You weakened the enemy's magic!
	YOU_WEAKENED_THE_ENEMYS_MAGIC(73662),
	// Text: Defeat $s1 healers and buffers.
	DEFEAT_S1_HEALERS_AND_BUFFERS(73751),
	// Text: You have defeated $s2 of $s1 healers and buffers.
	YOU_HAVE_DEFEATED_S2_OF_S1_HEALERS_AND_BUFFERS(73761),
	// Text: You have weakened the enemy's support!
	YOU_HAVE_WEAKENED_THE_ENEMYS_SUPPORT(73762),
	// Text: Defeat $s1 warsmiths and overlords.
	DEFEAT_S1_WARSMITHS_AND_OVERLORDS(73851),
	// Text: You have defeated $s2 of $s1 warsmiths and overlords.
	YOU_HAVE_DEFEATED_S2_OF_S1_WARSMITHS_AND_OVERLORDS(73861),
	// Text: You destroyed the enemy's professionals!
	YOU_DESTROYED_THE_ENEMYS_PROFESSIONALS(73862),
	// Text: Return
	RETURN(1000170),
	// Text: Event Number
	EVENT_NUMBER(1000172),
	// Text: First Prize
	FIRST_PRIZE(1000173),
	// Text: Second Prize
	SECOND_PRIZE(1000174),
	// Text: Third Prize
	THIRD_PRIZE(1000175),
	// Text: Fourth Prize
	FOURTH_PRIZE(1000176),
	// Text: There has been no winning lottery ticket.
	THERE_HAS_BEEN_NO_WINNING_LOTTERY_TICKET(1000177),
	// Text: Your lucky numbers have been selected above.
	YOUR_LUCKY_NUMBERS_HAVE_BEEN_SELECTED_ABOVE(1000179),
	// Text: Prepare to die, foreign invaders! I am Gustav, the eternal ruler of
	// this fortress and I have taken up my sword to repel thee!
	PREPARE_TO_DIE_FOREIGN_INVADERS_I_AM_GUSTAV_THE_ETERNAL_RULER_OF_THIS_FORTRESS_AND_I_HAVE_TAKEN_UP_MY_SWORD_TO_REPEL_THEE(1000275),
	// Text: Glory to Aden, the Kingdom of the Lion! Glory to Sir Gustav, our
	// immortal lord!
	GLORY_TO_ADEN_THE_KINGDOM_OF_THE_LION_GLORY_TO_SIR_GUSTAV_OUR_IMMORTAL_LORD(1000276),
	// Text: Soldiers of Gustav, go forth and destroy the invaders!
	SOLDIERS_OF_GUSTAV_GO_FORTH_AND_DESTROY_THE_INVADERS(1000277),
	// Text: This is unbelievable! Have I really been defeated? I shall return
	// and take your head!
	THIS_IS_UNBELIEVABLE_HAVE_I_REALLY_BEEN_DEFEATED_I_SHALL_RETURN_AND_TAKE_YOUR_HEAD(1000278),
	// Text: Could it be that I have reached my end? I cannot die without honor,
	// without the permission of Sir Gustav!
	COULD_IT_BE_THAT_I_HAVE_REACHED_MY_END_I_CANNOT_DIE_WITHOUT_HONOR_WITHOUT_THE_PERMISSION_OF_SIR_GUSTAV(1000279),
	// Text: Ah, the bitter taste of defeat... I fear my torments are not
	// over...
	AH_THE_BITTER_TASTE_OF_DEFEAT_I_FEAR_MY_TORMENTS_ARE_NOT_OVER(1000280),
	// This world will soon be annihilated!
	THIS_WORLD_WILL_SOON_BE_ANNIHILATED(1000303),
	// All is lost! Prepare to meet the goddess of death!
	ALL_IS_LOST__PREPARE_TO_MEET_THE_GODDESS_OF_DEATH(1000415),
	// All is lost! The prophecy of destruction has been fulfilled!
	ALL_IS_LOST__THE_PROPHECY_OF_DESTRUCTION_HAS_BEEN_FULFILLED(1000416),
	// The end of time has come! The prophecy of destruction has been fulfilled!
	THE_END_OF_TIME_HAS_COME__THE_PROPHECY_OF_DESTRUCTION_HAS_BEEN_FULFILLED(1000417),
	// The day of judgment is near!
	THE_DAY_OF_JUDGMENT_IS_NEAR(1000305),
	// The prophecy of darkness has been fulfilled!
	THE_PROPHECY_OF_DARKNESS_HAS_BEEN_FULFILLED(1000421),
	// As foretold in the prophecy of darkness, the era of chaos has begun!
	AS_FORETOLD_IN_THE_PROPHECY_OF_DARKNESS__THE_ERA_OF_CHAOS_HAS_BEGUN(1000422),
	// The prophecy of darkness has come to pass!
	THE_PROPHECY_OF_DARKNESS_HAS_COME_TO_PASS(1000423),
	// I bestow upon you a blessing!
	I_BESTOW_UPON_YOU_A_BLESSING(1000306),
	// $s1! I give you the blessing of prophecy!
	S1__I_GIVE_YOU_THE_BLESSING_OF_PROPHECY(1000424),
	// Herald of the new era, open your eyes!
	HERALD_OF_THE_NEW_ERA__OPEN_YOUR_EYES(1000426),
	// $s1! I bestow upon you the authority of the abyss!
	S1__I_BESTOW_UPON_YOU_THE_AUTHORITY_OF_THE_ABYSS(1000425),
	// You don't have any hope! Your end has come!
	YOU_DONT_HAVE_ANY_HOPE__YOUR_END_HAS_COME(1000420),
	// A curse upon you!
	A_CURSE_UPON_YOU(1000304),
	// $s1! You bring an ill wind!
	S1__YOU_BRING_AN_ILL_WIND(1000418),
	// $s1! You might as well give up!
	S1__YOU_MIGHT_AS_WELL_GIVE_UP(1000419),
	// Text: The defenders of $s1 castle will be teleported to the inner castle.
	THE_DEFENDERS_OF_S1_CASTLE_WILL_BE_TELEPORTED_TO_THE_INNER_CASTLE(1000443),
	// Text: Competition
	COMPETITION(1000507),
	// Text: Seal Validation
	SEAL_VALIDATION(1000508),
	// Text: Preparation
	PREPARATION(1000509),
	// Text: Dusk
	DUSK(1000510),
	// Text: Dawn
	DAWN(1000511),
	// Text: No Owner
	NO_OWNER(1000512),
	// Text: **unregistered**
	__UNREGISTERED__(1000495),
	// Arrogant fool! You dare to challenge me, the Ruler of Flames? Here is
	// your reward!
	VALAKAS_ARROGAANT_FOOL_YOU_DARE_TO_CHALLENGE_ME(1000519),
	// Valakas finds your attacks to be annoying and disruptive to his
	// concentration. Keep it up!
	VALAKAS_FINDS_YOU_ATTACKS_ANNOYING_SILENCE(1801071),
	// Valakas' P.Def. is momentarily decreased because a warrior sliced a great
	// gash in his side!
	VALAKAS_PDEF_ISM_DECREACED_SLICED_DASH(1801072),
	// Your attacks have overwhelmed Valakas, momentarily distracting him from
	// his rage! Now's the time to attack!
	VALAKAS_OVERWHELMED_BY_ATTACK_NOW_TIME_ATTACK(1801073),
	// Your ranged attacks are provoking Valakas. If this continues, you might
	// find yourself in a dangerous situation.
	VALAKAS_RANGED_ATTACKS_PROVOKED(1801074),
	// Your sneaky counterattacks have heightened Valakas' rage, increasing his
	// attack power.
	VALAKAS_HEIGHTENED_BY_COUNTERATTACKS(1801075),
	// Your ranged attacks have enraged Valakas, causing him to attack his
	// target relentlessly.
	VALAKAS_RANGED_ATTACKS_ENRAGED_TARGET_FREE(1801076),
	// The evil Fire Dragon Valakas has been defeated!
	SOMETHING_LIKE_THAT_COMES_OUT_OF_THE_RUINS(1811287),
	VALAKAS_THE_EVIL_FIRE_DRAGON_VALAKAS_DEFEATED(1900151),
	// You cannot hope to defeat me with your meager strength.
	ANTHARAS_YOU_CANNOT_HOPE_TO_DEFEAT_ME(1000520),
	// The evil Land Dragon Antharas has been defeated!
	ANTHARAS_THE_EVIL_LAND_DRAGON_ANTHARAS_DEFEATED(1900150),
	// Earth energy is gathering near Antharas's legs.
	ANTHARAS_EARTH_ENERGY_GATHERING_LEGS(1900155),
	// Antharas starts to absorb the earth energy.
	ANTHARAS_STARTS_ABSORB_EARTH_ENERGY(1900156),
	// Antharas raises its thick tail.
	ANTHARAS_RAISES_ITS_THICK_TAIL(1900157),
	// You are overcome by the strength of Antharas.
	ANTHARAS_YOU_ARE_OVERCOME_(1900158),
	// Antharas's eyes are filled with rage.
	ANTHARAS_EYES_FILLED_WITH_RAGE(1900159),
	// Text: Requiem of Hatred
	REQUIEM_OF_HATRED(1000522),
	// Text: Fugue of Jubilation
	FUGUE_OF_JUBILATION(1000523),
	// Text: Frenetic Toccata
	FRENETIC_TOCCATA(1000524),
	// Text: Hypnotic Mazurka
	HYPNOTIC_MAZURKA(1000525),
	// Text: Mournful Chorale Prelude
	MOURNFUL_CHORALE_PRELUDE(1000526),
	// Text: Rondo of Solitude
	RONDO_OF_SOLITUDE(1000527),
	// Text: Gludio
	GLUDIO(1001001),
	// Text: Dion
	DION(1001002),
	// Text: Giran
	GIRAN(1001003),
	// Text: Oren
	OREN(1001004),
	// Text: Aden
	ADEN(1001005),
	// Text: Innadril
	INNADRIL(1001006),
	// Text: The Kingdom of Elmore
	THE_KINGDOM_OF_ELMORE(1001100),
	// Text: Goddard
	GODDARD(1001007),
	// Text: Rune
	RUNE(1001008),
	// Text: Schuttgart
	SCHUTTGART(1001009),
	// Text: A black moon... Now do you understand that he has opened his eyes?
	A_BLACK_MOON_NOW_DO_YOU_UNDERSTAND_THAT_HE_HAS_OPENED_HIS_EYES(1010221),
	// Text: Clouds of blood are gathering. Soon, it will start to rain. The
	// rain of crimson blood...
	CLOUDS_OF_BLOOD_ARE_GATHERING_SOON_IT_WILL_START_TO_RAIN_THE_RAIN_OF_CRIMSON_BLOOD(1010222),
	// Text: While the foolish light was asleep, the darkness will awaken first.
	// Uh huh huh...
	WHILE_THE_FOOLISH_LIGHT_WAS_ASLEEP_THE_DARKNESS_WILL_AWAKEN_FIRST_UH(1010223),
	// Text: It is the deepest darkness. With its arrival, the world will soon
	// die.
	IT_IS_THE_DEEPEST_DARKNESS_WITH_ITS_ARRIVAL_THE_WORLD_WILL_SOON_DIE(1010224),
	// Text: Death is just a new beginning. Huhu... Fear not.
	DEATH_IS_JUST_A_NEW_BEGINNING_HUHU_FEAR_NOT(1010225),
	// Text: Ahh! Beautiful goddess of death! Cover over the filth of this world
	// with your darkness!
	AHH_BEAUTIFUL_GODDES_OF_DEATH_COVER_OVER_THE_FILTH_OF_THOS_WORLD_YOUR_DARKNESS(1010226),
	// Text: The goddess's resurrection has already begun. Huhu... Insignificant
	// creatures like you can do nothing!
	THE_GODDESS_RESURRECTION_HAS_ALREADY_BEGUN_HUHU_INSIGNIFICANT_CREATURES_LIKE_YOU_CAN_DO_NOTHING(1010227),
	// Text: Who dares to covet the throne of our castle! Leave immediately or
	// you will pay the price of your audacity with your very own blood!
	WHO_DARES_TO_COVET_THE_THRONE_OF_OUR_CASTLE__LEAVE_IMMEDIATELY_OR_YOU_WILL_PAY_THE_PRICE_OF_YOUR_AUDACITY_WITH_YOUR_VERY_OWN_BLOOD(1010623),
	// Text: Hmm, those who are not of the bloodline are coming this way to take
	// over the castle?! Humph! The bitter grudges of the dead. You must not
	// make light of their power!
	HMM_THOSE_WHO_ARE_NOT_OF_THE_BLOODLINE_ARE_COMING_THIS_WAY_TO_TAKE_OVER_THE_CASTLE__HUMPH__THE_BITTER_GRUDGES_OF_THE_DEAD(1010624),
	// Text: Aargh...! If I die, then the magic force field of blood will...!
	AARGH_IF_I_DIE_THEN_THE_MAGIC_FORCE_FIELD_OF_BLOOD_WILL(1010625),
	// Text: It's not over yet... It won't be... over... like this... Never...
	ITS_NOT_OVER_YET__IT_WONT_BE__OVER__LIKE_THIS__NEVER(1010626),
	// Text: Oooh! Who poured nectar on my head while I was sleeping?
	OOOH_WHO_POURED_NECTAR_ON_MY_HEAD_WHILE_I_WAS_SLEEPING(1010627),
	// Text: Undecided
	UNDECIDED(1010635),
	// Text: Heh Heh... I see that the feast has begun! Be wary! The curse of
	// the Hellmann family has poisoned this land!
	HEH_HEH_I_SEE_THAT_THE_FEAST_HAS_BEGAN_BE_WARY_THE_CURSE_OF_THE_HELLMANN_FAMILY_HAS_POISONED_THIS_LAND(1010636),
	// Text: Arise, my faithful servants! You, my people who have inherited the
	// blood. It is the calling of my daughter. The feast of blood will now
	// begin!
	ARISE_MY_FAITHFUL_SERVANTS_YOU_MY_PEOPLE_WHO_HAVE_INHERITED_THE_BLOOD(1010637),
	// Text: Grarr! For the next 2 minutes or so, the game arena are will be
	// cleaned. Throw any items you don't need to the floor now.
	GRARR_FOR_THE_NEXT_2_MINUTES_OR_SO_THE_GAME_ARENA_ARE_WILL_BE_CLEANED(1010639),
	// Text: Match begins in $s1 minute(s). Please gather around the
	// administrator.
	MATCH_BEGINS_IN_S1_MINUTES(1800080),
	// Text: The match is automatically canceled because you are too far from
	// the admission manager.
	THE_MATCH_IS_AUTOMATICALLY_CANCELED_BECAUSE_YOU_ARE_TOO_FAR_FROM_THE_ADMISSION_MANAGER(1800081),
	// Text: Match cancelled. Opponent did not meet the stadium admission
	// requirements.
	MATCH_CANCELLED(1800123),
	// Text: Begin stage 1
	BEGIN_STAGE_1_FREYA(1801086),
	// Text: Begin stage 2
	BEGIN_STAGE_2_FREYA(1801087),
	// Text: Begin stage 3
	BEGIN_STAGE_3_FREYA(1801088),
	// Text: Begin stage 4
	BEGIN_STAGE_4_FREYA(1801089),
	// Text: Time remaining until next battle
	TIME_REMAINING_UNTIL_NEXT_BATTLE(1801090),
	// Text: Freya has started to move.
	FREYA_HAS_STARTED_TO_MOVE(1801097),
	// Text: $s1 of Balance
	S1_OF_BALANCE(1801100),
	// Text: Swift $s1
	SWIFT_S1(1801101),
	// Text: $s1 of Blessing
	S1_OF_BLESSING(1801102),
	// Text: Sharp $s1
	SHARP_S1(1801103),
	// Text: Useful $s1
	USEFUL_S1(1801104),
	// Text: Reckless $s1
	RECKLESS_S1(1801105),
	// Text: Alpen Kookaburra
	ALPEN_KOOKABURRA(1801106),
	// Text: Alpen Cougar
	ALPEN_COUGAR(1801107),
	// Text: Alpen Buffalo
	ALPEN_BUFFALO(1801108),
	// Text: Alpen Grendel
	ALPEN_GRENDEL(1801109),
	// Text: We have broken through the gate! Destroy the encampment and move to
	// the Command Post!
	WE_HAVE_BROKEN_THROUGH_THE_GATE_DESTROY_THE_ENCAMPMENT_AND_MOVE_TO_THE_COMMAND_POST(1300001),
	// Text: The command gate has opened! Capture the flag quickly and raise it
	// high to proclaim our victory!
	THE_COMMAND_GATE_HAS_OPENED_CAPTURE_THE_FLAG_QUICKLY_AND_RAISE_IT_HIGH_TO_PROCLAIM_OUR_VICTORY(1300002),
	// Text: The gods have forsaken us... Retreat!!
	THE_GODS_HAVE_FORSAKEN_US__RETREAT(1300003),
	// Text: You may have broken our arrows, but you will never break our will!
	// Archers, retreat!
	YOU_MAY_HAVE_BROKEN_OUR_ARROWS_BUT_YOU_WILL_NEVER_BREAK_OUR_WILL_ARCHERS_RETREAT(1300004),
	// Text: At last! The Magic Field that protects the fortress has weakened!
	// Volunteers, stand back!
	AT_LAST_THE_MAGIC_FIELD_THAT_PROTECTS_THE_FORTRESS_HAS_WEAKENED_VOLUNTEERS_STAND_BACK(1300005),
	// Text: Aiieeee! Command Center! This is guard unit! We need backup right
	// away!
	AIIEEEE_COMMAND_CENTER_THIS_IS_GUARD_UNIT_WE_NEED_BACKUP_RIGHT_AWAY(1300006),
	// Text: Fortress power disabled.
	FORTRESS_POWER_DISABLED(1300007),
	// Text: Machine No. 1 - Power Off!
	MACHINE_NO_1_POWER_OFF(1300009),
	// Text: Machine No. 2 - Power Off!
	MACHINE_NO_2_POWER_OFF(1300010),
	// Text: Machine No. 3 - Power Off!
	MACHINE_NO_3_POWER_OFF(1300011),
	// Text: Spirit of Fire, unleash your power! Burn the enemy!!
	SPIRIT_OF_FIRE_UNLEASH_YOUR_POWER_BURN_THE_ENEMY(1300014),
	// Text: Do you need my power? You seem to be struggling.
	DO_YOU_NEED_MY_POWER_YOU_SEEM_TO_BE_STRUGGLING(1300016),
	// Text: Don't think that it's gonna end like this. Your ambition will soon
	// be destroyed as well.
	DONT_THINK_THAT_ITS_GONNA_END_LIKE_THIS(1300018),
	// Text: I feel so much grief that I can't even take care of myself. There
	// isn't any reason for me to stay here any longer.
	I_FEEL_SO_MUCH_GRIEF_THAT_I_CANT_EVEN_TAKE_CARE_OF_MYSELF(1300020),
	// Text: Independent State
	INDEPENDENT_STATE(1300122),
	// Text: Nonpartisan
	NONPARTISAN(1300123),
	// Text: Contract State
	CONTRACT_STATE(1300124),
	// Text: First password has been entered.
	FIRST_PASSWORD_HAS_BEEN_ENTERED(1300125),
	// Text: Second password has been entered.
	SECOND_PASSWORD_HAS_BEEN_ENTERED(1300126),
	// Text: Password has not been entered.
	PASSWORD_HAS_NOT_BEEN_ENTERED(1300127),
	// Text: Attempt $s1 / 3 is in progress. => This is the third attempt on
	// $s1.
	ATTEMPT_S1__3_IS_IN_PROGRESS(1300128),
	// Text: The 1st Mark is correct.
	THE_1ST_MARK_IS_CORRECT(1300129),
	// Text: The 2nd Mark is correct.
	THE_2ND_MARK_IS_CORRECT(1300130),
	// Text: The Marks have not been assembled.
	THE_MARKS_HAVE_NOT_BEEN_ASSEMBLED(1300131),
	// Text: Olympiad class-free team match is going to begin in Arena $s1 in a
	// moment.
	OLYMPIAD_CLASSFREE_TEAM_MATCH_IS_GOING_TO_BEGIN_IN_ARENA_S1_IN_A_MOMENT(1300132),
	// Text: Domain Fortress
	DOMAIN_FORTRESS(1300133),
	// Text: Boundary Fortress
	BOUNDARY_FORTRESS(1300134),
	// Text: $s1hour $s2minute
	S1HOUR_S2MINUTE(1300135),
	// Text: Begin stage 1!
	BEGIN_STAGE_1(1300150),
	// Text: Begin stage 2!
	BEGIN_STAGE_2(1300151),
	// Text: Begin stage 3!
	BEGIN_STAGE_3(1300152),
	// Text: What a predicament... my attempts were unsuccessful.
	WHAT_A_PREDICAMENT_MY_ATTEMPTS_WERE_UNSUCCESSUFUL(1300162),
	// Text: Courage! Ambition! Passion! Mercenaries who want to realize their
	// dream of fighting in the territory war, come to me! Fortune and glory are
	// waiting for you!
	COURAGE_AMBITION_PASSION_MERCENARIES_WHO_WANT_TO_REALIZE_THEIR_DREAM_OF_FIGHTING_IN_THE_TERRITORY_WAR_COME_TO_ME_FORTUNE_AND_GLORY_ARE_WAITING_FOR_YOU(1300163),
	// Text: Do you wish to fight? Are you afraid? No matter how hard you try,
	// you have nowhere to run. But if you face it head on, our mercenary troop
	// will help you out!
	DO_YOU_WISH_TO_FIGHT_ARE_YOU_AFRAID_NO_MATTER_HOW_HARD_YOU_TRY_YOU_HAVE_NOWHERE_TO_RUN(1300164),
	// Text: Charge! Charge! Charge!
	CHARGE_CHARGE_CHARGE(1300165),
	// Text: Olympiad class-free individual match is going to begin in Arena $s1
	// in a moment.
	OLYMPIAD_CLASSFREE_INDIVIDUAL_MATCH_IS_GOING_TO_BEGIN_IN_ARENA_S1_IN_A_MOMENT(1300166),
	// Text: Olympiad class individual match is going to begin in Arena $s1 in a
	// moment.
	OLYMPIAD_CLASS_INDIVIDUAL_MATCH_IS_GOING_TO_BEGIN_IN_ARENA_S1_IN_A_MOMENT(1300167),
	// Text: The airship has been summoned. It will automatically depart in 5
	// minutes.
	AIRSHIP_IS_SUMMONED_IS_DEPART_IN_5_MINUTES(1800219),
	// Text: The regularly scheduled airship has arrived. It will depart for the
	// Aden continent in 1 minute.
	AIRSHIP_IS_ARRIVED_IT_WILL_DEPART_TO_ADEN_IN_1_MINUTE(1800220),
	// Text: The regularly scheduled airship that flies to the Aden continent
	// has departed.
	AIRSHIP_IS_DEPARTED_TO_ADEN(1800221),
	// Text: The regularly scheduled airship has arrived. It will depart for the
	// Gracia continent in 1 minute.
	AIRSHIP_IS_ARRIVED_IT_WILL_DEPART_TO_GRACIA_IN_1_MINUTE(1800222),
	// Text: The regularly scheduled airship that flies to the Gracia continent
	// has departed.
	AIRSHIP_IS_DEPARTED_TO_GRACIA(1800223),
	// Text: Another airship has been summoned to the wharf. Please try again
	// later.
	IN_AIR_HARBOR_ALREADY_AIRSHIP_DOCKED_PLEASE_WAIT_AND_TRY_AGAIN(1800224),
	// Text: Attack
	ATTACK(1800243),
	// Text: Defend
	DEFEND(1800244),
	// Text: Maguen appearance!!!
	MAGUEN_APPEARANCE(1801149),
	// Text: There are 5 minutes remaining to register for Kratei's cube match.
	THERE_ARE_5_MINUTES_REMAINING_TO_REGISTER_FOR_KRATEIS_CUBE_MATCH(1800203),
	// Text: There are 3 minutes remaining to register for Kratei's cube match.
	THERE_ARE_3_MINUTES_REMAINING_TO_REGISTER_FOR_KRATEIS_CUBE_MATCH(1800204),
	// Text: There are 1 minutes remaining to register for Kratei's cube match.
	THERE_ARE_1_MINUTES_REMAINING_TO_REGISTER_FOR_KRATEIS_CUBE_MATCH(1800205),
	// Text: The match will begin in $s1 minute(s).
	THE_MATCH_WILL_BEGIN_IN_S1_MINUTES(1800206),
	// Text: The match will begin shortly.
	THE_MATCH_WILL_BEGIN_SHORTLY(1800207),
	// Text: Registration for the next match will end at %s minutes after the
	// hour.
	REGISTRATION_FOR_THE_NEXT_MATCH_WILL_END_AT_S1_MINUTES_AFTER_HOUR(1800208),
	// Text: Even though you bring something called a gift among your humans, it
	// would just be problematic for me...
	EVEN_THOUGH_YOU_BRING_SOMETHING_CALLED_A_GIFT_AMONG_YOUR_HUMANS_IT_WOULD_JUST_BE_PROBLEMATIC_FOR_ME(1801190),
	// Text: I just don't know what expression I should have it appeared on me.
	// Are human's emotions like this feeling?
	I_JUST_DONT_KNOW_WHAT_EXPRESSION_I_SHOULD_HAVE_IT_APPEARED_ON_ME(1801191),
	// Text: The feeling of thanks is just too much distant memory for me...
	THE_FEELING_OF_THANKS_IS_JUST_TOO_MUCH_DISTANT_MEMORY_FOR_ME(1801192),
	// Text: But I kind of miss it... Like I had felt this feeling before...
	BUT_I_KIND_OF_MISS_IT(1801193),
	// Text: I am Ice Queen Freya... This feeling and emotion are nothing but a
	// part of Melissa'a memories.
	I_AM_ICE_QUEEN_FREYA(1801194),
	// Text: Dear $s1... Think of this as my appreciation for the gift. Take
	// this with you. There's nothing strange about it. It's just a bit of my
	// capriciousness...
	DEAR_S1(1801195),
	// Text: Rulers of the seal! I bring you wondrous gifts!
	RULERS_OF_THE_SEAL_I_BRING_YOU_WONDROUS_GIFTS(1000431),
	// Text: Rulers of the seal! I have some excellent weapons to show you!
	RULERS_OF_THE_SEAL_I_HAVE_SOME_EXCELLENT_WEAPONS_TO_SHOW_YOU(1000432),
	// Text: I've been so busy lately, in addition to planning my trip!
	IVE_BEEN_SO_BUSY_LATELY_IN_ADDITION_TO_PLANNING_MY_TRIP(1000433),
	// Text: If you have items, please give them to me.
	IF_YOU_HAVE_ITEMS_PLEASE_GIVE_THEM_TO_ME(1800279),
	// Text: My stomach is empty.
	MY_STOMACH_IS_EMPTY(1800280),
	// Text: I'm hungry, I'm hungry!
	IM_HUNGRY_IM_HUNGRY(1800281),
	// Text: I'm still not full...
	IM_STILL_NOT_FULL(1800282),
	// Text: I'm still hungry~
	IM_STILL_HUNGRY(1800283),
	// Text: I feel a little woozy...
	I_FEEL_A_LITTLE_WOOZY(1800284),
	// Text: Give me something to eat.
	GIVE_ME_SOMETHING_TO_EAT(1800285),
	// Text: Now it's time to eat~
	NOW_ITS_TIME_TO_EAT(1800286),
	// Text: I also need a dessert.
	I_ALSO_NEED_A_DESSERT(1800287),
	// Text: I'm still hungry.
	IM_STILL_HUNGRY_(1800288),
	// Text: I'm full now, I don't want to eat anymore.
	IM_FULL_NOW_I_DONT_WANT_TO_EAT_ANYMORE(1800289),
	PERHAPS_EVEN_THE_VILLAGE_BECOMES_DANGEROUS(1811307),
	// Text: Elapsed Time :
	ELAPSED_TIME(1911119),
	// Text: Time Remaining :
	TIME_REMAINING(1911120),
	// Text: Strong magic power can be felt from somewhere!!
	I_FEEL_STRONG_MAGIC_FLOW(1801111),
	// Text: I haven't eaten anything, I'm so weak~
	I_HAVENT_EATEN_ANYTHING_IM_SO_WEAK(1800290),
	// Text: We must search high and low in every room for the reading desk that
	// contains the book we seek.
	WE_MUST_SEARCH_HIGH_AND_LOW_IN_EVERY_ROOM_FOR_THE_READING_DESK_THAT_CONTAINS_THE_BOOK_WE_SEEK(1029450),
	// Text: Remember the content of the books that you found. You can't take
	// them out with you.
	REMEMBER_THE_CONTENT_OF_THE_BOOKS_THAT_YOU_FOUND(1029451),
	// Text: It seems that you cannot remember to the room of the watcher who
	// found the book.
	IT_SEEMS_THAT_YOU_CANNOT_REMEMBER_TO_THE_ROOM_OF_THE_WATCHER_WHO_FOUND_THE_BOOK(1029452),
	// Text: Your work here is done, so return to the central guardian.
	YOUR_WORK_HERE_IS_DONE_SO_RETURN_TO_THE_CENTRAL_GUARDIAN(1029453),
	// Text: The guardian of the seal doesn't seem to get injured at all until
	// the barrier is destroyed.
	THE_GUARDIAN_OF_THE_SEAL_DOESNT_SEEM_TO_GET_INJURED_AT_ALL_UNTIL_THE_BARRIER_IS_DESTROYED(1029550),
	// Text: The device located in the room in front of the guardian of the seal
	// is definitely the barrier that controls the guardian's power.
	THE_DEVICE_LOCATED_IN_THE_ROOM_IN_FRONT_OF_THE_GUARDIAN_OF_THE_SEAL_IS_DEFINITELY_THE_BARRIER_THAT_CONTROLS_THE_GUARDIANS_POWER(1029551),
	// Text: To remove the barrier, you must find the relics that fit the
	// barrier and activate the device.
	TO_REMOVE_THE_BARRIER_YOU_MUST_FIND_THE_RELICS_THAT_FIT_THE_BARRIER_AND_ACTIVATE_THE_DEVICE(1029552),
	// Text: All the guardians were defeated, and the seal was removed. Teleport
	// to the center.
	ALL_THE_GUARDIANS_WERE_DEFEATED_AND_THE_SEAL_WAS_REMOVED(1029553),
	// Text: What took so long? I waited for ever.
	WHAT_TOOK_SO_LONG_I_WAITED_FOR_EVER(1029350),
	// Text: I must ask Librarian Sophia about the book.
	I_MUST_ASK_LIBRARIAN_SOPHIA_ABOUT_THE_BOOK(1029351),
	// Text: This library... It's huge but there aren't many useful books,
	// right?
	THIS_LIBRARY(1029352),
	// Text: An underground library... I hate damp and smelly places...
	AN_UNDERGROUND_LIBRARY(1029353),
	// Text: The book that we seek is certainly here. Search inch by inch.
	THE_BOOK_THAT_WE_SEEK_IS_CERTAINLY_HERE(1029354),
	// Text: You foolish invaders who disturb the rest of Solina, be gone from
	// this place.
	YOU_FOOLISH_INVADERS_WHO_DISTURB_THE_REST_OF_SOLINA_BE_GONE_FROM_THIS_PLACE(1029460),
	// Text: I know not what you seek, but this truth cannot be handled by mere
	// humans.
	I_KNOW_NOT_WHAT_YOU_SEEK_BUT_THIS_TRUTH_CANNOT_BE_HANDLED_BY_MERE_HUMANS(1029461),
	// Text: I will not stand by and watch your foolish actions. I warn you,
	// leave this place at once.
	I_WILL_NOT_STAND_BY_AND_WATCH_YOUR_FOOLISH_ACTIONS(1029462),
	// Text: Come and eat.
	COME_AND_EAT(1801117),
	// Text: Looks delicious.
	LOOKS_DELICIOUS(1801118),
	// Text: Let's go eat.
	LETS_GO_EAT(1801119),
	// Text: Hall of Suffering
	HALL_OF_SUFFERING(1800240),
	// Text: Hall of Erosion
	HALL_OF_EROSION(1800241),
	// Text: Heart of Immortality
	HEART_OF_IMMORTALITY(1800242),
	// Text: You can hear the undead of Ekimus rushing toward you. $s1 $s2, it
	// has now begun!
	YOU_CAN_HEAR_THE_UNDEAD_OF_EKIMUS_RUSHING_TOWARD_YOU(1800263),
	// Text: The tumor inside $s1 has been destroyed! \nIn order to draw out the
	// cowardly Cohemenes, you must destroy all the tumors!
	THE_TUMOR_INSIDE_S1_HAS_BEEN_DESTROYED_NIN_ORDER_TO_DRAW_OUT_THE_COWARDLY_COHEMENES_YOU_MUST_DESTROY_ALL_THE_TUMORS(1800274),
	// Text: The tumor inside $s1 has completely revived. \nThe restrengthened
	// Cohemenes has fled deeper inside the seed...
	THE_TUMOR_INSIDE_S1_HAS_COMPLETELY_REVIVED(1800275),
	// Text: All the tumors inside $s1 have been destroyed! Driven into a
	// corner, Cohemenes appears close by!
	ALL_THE_TUMORS_INSIDE_S1_HAVE_BEEN_DESTROYED_DRIVEN_INTO_A_CORNER_COHEMENES_APPEARS_CLOSE_BY(1800299),
	// Text: $s1's party has moved to a different location through the crack in
	// the tumor!
	S1S_PARTY_HAS_MOVED_TO_A_DIFFERENT_LOCATION_THROUGH_THE_CRACK_IN_THE_TUMOR(1800247),
	// Text: $s1's party has entered the Chamber of Ekimus through the crack in
	// the tumor!
	S1S_PARTY_HAS_ENTERED_THE_CHAMBER_OF_EKIMUS_THROUGH_THE_CRACK_IN_THE_TUMOR(1800248),
	// Text: Ekimus has sensed abnormal activity. \nThe advancing party is
	// forcefully expelled!
	EKIMUS_HAS_SENSED_ABNORMAL_ACTIVITY(1800249),
	// Text: C'mon, c'mon! Show your face, you little rats! Let me see what the
	// doomed weaklings are scheming!
	CMON_CMON_SHOW_YOUR_FACE_YOU_LITTLE_RATS_LET_ME_SEE_WHAT_THE_DOOMED_WEAKLINGS_ARE_SCHEMING(1800233),
	// Text: Impressive.... Hahaha it's so much fun, but I need to chill a
	// little while. Argekunte, clear the way!
	IMPRESSIVE(1800234),
	// Text: Kyahaha! Since the tumor has been resurrected, I no longer need to
	// waste my time on you!
	KYAHAHA_SINCE_THE_TUMOR_HAS_BEEN_RESURRECTED_I_NO_LONGER_NEED_TO_WASTE_MY_TIME_ON_YOU(1800235),
	// Text: Keu... I will leave for now... But don't think this is over... The
	// Seed of Infinity can never die...
	KEU(1800236),
	// Text: $s1 minute(s) are remaining.
	S1_MINUTES_ARE_REMAINING(1010643),
	// Text: Congratulations! You have succeeded at $s1 $s2! The instance will
	// shortly expire.
	CONGRATULATIONS_YOU_HAVE_SUCCEEDED_AT_S1_S2_THE_INSTANCE_WILL_SHORTLY_EXPIRE(1800245),
	// Text: You have failed at $s1 $s2... The instance will shortly expire.
	YOU_HAVE_FAILED_AT_S1_S2(1800246),
	// Text: You will participate in $s1 $s2 shortly. Be prepared for anything.
	YOU_WILL_PARTICIPATE_IN_S1_S2_SHORTLY(1800262),
	// Text: I shall accept your challenge, $s1! Come and die in the arms of
	// immortality!
	I_SHALL_ACCEPT_YOUR_CHALLENGE_S1_COME_AND_DIE_IN_THE_ARMS_OF_IMMORTALITY(1800261),
	// Text: The tumor inside $s1 that has provided energy \n to Ekimus is
	// destroyed!
	THE_TUMOR_INSIDE_S1_THAT_HAS_PROVIDED_ENERGY_N_TO_EKIMUS_IS_DESTROYED(1800302),
	// Text: The tumor inside $s1 has been completely resurrected \n and started
	// to energize Ekimus again...
	THE_TUMOR_INSIDE_S1_HAS_BEEN_COMPLETELY_RESURRECTED_N_AND_STARTED_TO_ENERGIZE_EKIMUS_AGAIN(1800303),
	// Text: With all connections to the tumor severed, Ekimus has lost its
	// power to control the Feral Hound!
	WITH_ALL_CONNECTIONS_TO_THE_TUMOR_SEVERED_EKIMUS_HAS_LOST_ITS_POWER_TO_CONTROL_THE_FERAL_HOUND(1800269),
	// Text: With the connection to the tumor restored, Ekimus has regained
	// control over the Feral Hound...
	WITH_THE_CONNECTION_TO_THE_TUMOR_RESTORED_EKIMUS_HAS_REGAINED_CONTROL_OVER_THE_FERAL_HOUND(1800270),
	// Text: There is no party currently challenging Ekimus. \n If no party
	// enters within $s1 seconds, the attack on the Heart of Immortality will
	// fail...
	THERE_IS_NO_PARTY_CURRENTLY_CHALLENGING_EKIMUS(1800229),
	// Text: You can feel the surging energy of death from the tumor.
	YOU_CAN_FEEL_THE_SURGING_ENERGY_OF_DEATH_FROM_THE_TUMOR(1800264),
	// Text: The area near the tumor is full of ominous energy.
	THE_AREA_NEAR_THE_TUMOR_IS_FULL_OF_OMINOUS_ENERGY(1800265),
	// Text: The tumor inside $s1 has been destroyed! \nThe nearby Undead that
	// were attacking Seed of Life start losing their energy and run away!
	THE_TUMOR_INSIDE_S1_HAS_BEEN_DESTROYED_NTHE_NEARBY_UNDEAD_THAT_WERE_ATTACKING_SEED_OF_LIFE_START_LOSING_THEIR_ENERGY_AND_RUN_AWAY(1800300),
	// Text: The tumor inside $s1 has completely revived. \nRecovered nearby
	// Undead are swarming toward Seed of Life...
	THE_TUMOR_INSIDE_S1_HAS_COMPLETELY_REVIVED_(1800301),
	// Text: The tumor inside $s1 has been destroyed! \nThe speed that Ekimus
	// calls out his prey has slowed down!
	THE_TUMOR_INSIDE_S1_HAS_BEEN_DESTROYED_NTHE_SPEED_THAT_EKIMUS_CALLS_OUT_HIS_PREY_HAS_SLOWED_DOWN(1800304),
	// Text: The tumor inside $s1 has completely revived. \nEkimus started to
	// regain his energy and is desperately looking for his prey...
	THE_TUMOR_INSIDE_S1_HAS_COMPLETELY_REVIVED__(1800305),
	// Text: Bring more, more souls...!
	BRING_MORE_MORE_SOULS(1800306),
	// Text: Ha, ha, ha!...
	HA_HA_HA(7164),
	// Text: The Soul Coffin has awakened Ekimus. If $s1 more Soul Coffin(s) are
	// created, the defense of the Heart of Immortality will fail...
	THE_SOUL_COFFIN_HAS_AWAKENED_EKIMUS(1800232),
	// Text: Yum-yum, yum-yum
	YUMYUM_YUMYUM(1800291),
	// Text: And now your journey begins.
	JOURNEY_BEGINS(1811294),
	// Text: Wait...wait a minute! I still have time!
	I_STILL_HAVE_TIME(1032003),
	// Text: Why have the heroes abandoned us?
	WHY_ABANDONED_US(1811286),
	// Text: Does the Goddess see what she has done?
	DOES_THE_GODDESS(1811285),
	// Text: Is it better to end destiny or start destiny
	BETTER_DESTINY(1811291),
	// Text: Try riding a Kookaru
	RIDING_KOOKARU(17178345),
	// Text: Weapons have been added to your Inventory.
	WEAPONS_HAVE_BEEN_ADDED_TO_YOUR_INVENTORY(1032201),
	// Text: Come with me! I will lead you to Ibane.
	S1_COME_WITH_ME_I_WILL_LEAD_YOU_TO_IBANE(1032301),
	// Text: Come follow me!
	S1_COME_FOLLOW_ME(1032302),

	S1_COME_WITH_ME_I_WILL_LEAD_YOU_TO_HOLDEN(1032304),
	// Text: That man in front is Ibane.
	S1_THAT_MAN_IN_FRONT_IS_IBANE(1032303),
	// Text: That man in front is Holden.
	S1_THAT_MAN_IN_FRONT_IS_HOLDEN(1032306),

	GOING_INTO_REAL_WAR_SOULSHOTS_ADDED(1032351),
	GOING_INTO_REAL_WAR_AUTOMATE_SOULSHOTS(1032352),
	GOING_INTO_REAL_WAR_SPIRITSHOTS_ADDED(1032351),
	GOING_INTO_REAL_WAR_AUTOMATE_SPIRITSHOTS(1032352),

	WATCH_OUT_YOU_ARE_BEING_ATTACKED(1032322),
	FINALLY_I_THOUGHT_I_WAS_GOING_TO_DIE_WAITING(1032324),
	YOUR_NORMAL_ATTACKS_ARENT_WORKING(1032325),
	USE_YOUR_SKILL_ATTACKS_AGAINST_THEM(1032327),
	LOOKS_LIKE_ONLY_SKILL_BASED_ATTACKS_DAMAGE_THEM(1032326),
	ENOUGH_OF_THIS_COME_AT_ME(1032328),

	// Text: When the combat is difficult, I will help.
	WHEN_THE_COMBAT_IS_DIFFICULT_I_WILL_HELP(1811201),
	// Text: Speak with me about traveling around Aden.
	SPEAK_WITH_ME_ABOUT_TRAVELING_AROUND_ADEN(1811308),
	// Text: Look at all the newbies. Ha ha ha.
	LOOK_AT_ALL_THE_NEWBIES_HA_HA_HA(1811292),
	// Text: To your right the Administrative district and to the left is the
	// Museum.
	TO_YOUR_RIGHT_THE_ADMINISTRATIVE_DISTRICT_AND_TO_THE_LEFT_IS_THE_MUSEUM(1032340),
	// Text: When you use the teleporter, you can go to the Ye Sagira Ruins.
	WHEN_YOU_USE_THE_TELEPORTER_YOU_CAN_GO_TO_THE_YE_SAGIRA_RUINS(1032341),
	// Text: Have you been to Ye Sagira Ruins? You have to go at least once.
	HAVE_YOU_BEEN_TO_YE_SAGIRA_RUINS_YOU_HAVE_TO_GO_AT_LEAST_ONCE(1032342),
	// Text: The best weapon doesn't make you the best.
	THE_BEST_WEAPON_DOESN_T_MAKE_YOU_THE_BEST(1032320),
	// Text: We buy and sell. Come take a look.
	WE_BUY_AND_SELL_COME_TAKE_A_LOOK(1032321),
	// Text: You'll earn tons of items using the Training Grounds.
	YOU_LL_EARN_TONS_OF_ITEMS_USING_THE_TRAINING_GROUNDS(1811256),
	// Text: Kids these days...
	KIDS_THESE_DAYS(1811257),
	// Text: When I was young...
	WHEN_I_WAS_YOUNG(1811258),
	// Text: Information is collected in the Museum where can learn about the
	// heroes.
	INFORMATION_IS_COLLECTED_IN_THE_MUSEUM_WHERE_CAN_LEARN_ABOUT_THE_HEROES(1032355),
	// Text: Visit the Administration Office to form a clan.
	VISIT_THE_ADMINISTRATION_OFFICE_TO_FORM_A_CLAN(1032356),
	// Text: Kakai manages the Administration Office.
	KAKAI_MANAGES_THE_ADMINISTRATION_OFFICE(1032357),
	// Text: Training Grounds has underground facilities as well.
	TRAINING_GROUNDS_HAS_UNDERGROUND_FACILITIES_AS_WELL(1032358),
	// Text: If you wish to use the Training Grounds, meet Shannon.
	IF_YOU_WISH_TO_USE_THE_TRAINING_GROUNDS_MEET_SHANNON(1032359),
	// Text: It's quite a walk to Ye Sagira Ruins...
	IT_S_QUITE_A_WALK_TO_YE_SAGIRA_RUINS(1032313),
	// Text: Isn't there an easier way to get there?
	ISN_T_THERE_AN_EASIER_WAY_TO_GET_THERE(1032314),
	// Text: It's dangerous out there if you don't know what you're doing.
	IT_S_DANGEROUS_OUT_THERE_IF_YOU_DON_T_KNOW_WHAT_YOU_RE_DOING(1032315),
	// Text: You will find Pantheon in the Museum.
	YOU_WILL_FIND_PANTHEON_IN_THE_MUSEUM(1032316),
	// Text: Training Ground is located straight ahead.
	TRAINING_GROUND_IS_LOCATED_STRAIGHT_AHEAD(1032343),
	// Text: While training in the Training Grounds, it becomes progressively
	// difficult.
	WHILE_TRAINING_IN_THE_TRAINING_GROUNDS_IT_BECOMES_PROGRESSIVELY_DIFFICULT(1032344),
	// Text: Training Grounds access? You need to speak with Pantheon in the
	// Museum.
	TRAINING_GROUNDS_ACCESS_YOU_NEED_TO_SPEAK_WITH_PANTHEON_IN_THE_MUSEUM(1032345),
	// Text: I haven't felt this good in ages.
	I_HAVEN_T_FELT_THIS_GOOD_IN_AGES(1811244),
	// Text: Hunting at the beach is a bad idea.
	HUNTING_AT_THE_BEACH_IS_A_BAD_IDEA(1032329),
	// Text: Only the strong survive at Ye Sagira Ruins.
	ONLY_THE_STRONG_SURVIVE_AT_YE_SAGIRA_RUINS(1032330),
	// Text: Don't go hunting without Soulshot.
	DON_T_GO_HUNTING_WITHOUT_SOULSHOT(1032331),
	// Text: Below level 75? Be sure to receive newbie buffs.
	BELOW_LEVEL_75_BE_SURE_TO_RECEIVE_NEWBIE_BUFFS(1032332),
	// Text: Try riding a Kookaru
	TRY_RIDING_A_KOOKARU(17178345),
	// Text: You can't ride a Kookaru now.
	YOU_CAN_T_RIDE_A_KOOKARU_NOW(1811297),
	// Text:Hey! Did you speak with Pantheon?
	HEY_DID_YOU_SPEAK_WITH_PANTHEON(1032346),
	// Text: Everyone needs to meet Pantheon first before hunting.
	EVERYONE_NEEDS_TO_MEET_PANTHEON_FIRST_BEFORE_HUNTING(1032347),
	// Text: Stop them from approaching the town!!
	STOP_THEM_FROM_APPROACHING_THE_TOWN(1811288),
	// Text: The Seven Signs ended...
	THE_SEVEN_SIGNS_ENDED(1811289),
	// Text: We need to find her weakness...
	WE_NEED_TO_FIND_HER_WEAKNESS(1811290),
	// Text: Why have the heroes abandoned us?
	WHY_HAVE_THE_HEROES_ABANDONED_US(1811286),
	// Text: Does the Goddess see what she has done?
	DOES_THE_GODDESS_SEE_WHAT_SHE_HAS_DONE(1811285),
	// Text: Boys are so annoying.
	BOYS_ARE_SO_ANNOYING(1811254),
	// Text: It's a miracle that the Talking Island has restored.
	IT_S_A_MIRACLE_THAT_THE_TALKING_ISLAND_HAS_RESTORED(1811251),
	// Text: Talking Island Village is really beautiful.
	TALKING_ISLAND_VILLAGE_IS_REALLY_BEAUTIFUL(1811243),
	// Text: Weee!
	WEEE(1811253),
	// Text: Come browse our inventory!
	COME_BROWSE_OUR_INVENTORY(1032317),
	// Text: Incredible weapons for sale!
	INCREDIBLE_WEAPONS_FOR_SALE(1032318),
	// Text: All races came together to rebuild Talking Island Village.
	ALL_RACES_CAME_TOGETHER_TO_REBUILD_TALKING_ISLAND_VILLAGE(1811250),
	// Text: Every race built a piece of this Village.
	EVERY_RACE_BUILT_A_PIECE_OF_THIS_VILLAGE(1811252),
	// Text: You can see the Statues of Heroes inside the Museum.
	YOU_CAN_SEE_THE_STATUES_OF_HEROES_INSIDE_THE_MUSEUM(1032333),
	// Text: One day a statue of you could be made.
	ONE_DAY_A_STATUE_OF_YOU_COULD_BE_MADE(1032334),
	// Text: You can view the Museum Statistics from the System Menu.
	YOU_CAN_VIEW_THE_MUSEUM_STATISTICS_FROM_THE_SYSTEM_MENU(1032335),
	// Text: When you go to the Museum, speak to Pantheon.
	WHEN_YOU_GO_TO_THE_MUSEUM_SPEAK_TO_PANTHEON(1032336),
	// Text: Some folks don't know what they are doing.
	SOME_FOLKS_DON_T_KNOW_WHAT_THEY_ARE_DOING(1032337),
	// Text: Don't know what to do? Look at the map.
	DON_T_KNOW_WHAT_TO_DO_LOOK_AT_THE_MAP(1032338),
	// Text: Do you see a scroll icon? Go that location.
	DO_YOU_SEE_A_SCROLL_ICON_GO_THAT_LOCATION(1032339),
	// Text: Alchemy is a science and an art.
	ALCHEMY_IS_A_SCIENCE_AND_AN_ART(1811245),
	// Text: If you ignore the Training Grounds, you'll regret it.
	IF_YOU_IGNORE_THE_TRAINING_GROUNDS_YOU_LL_REGRET_IT(1811255),
	// Text: Spiritshots are mixed!
	SPIRITSHOTS_ARE_MIXED(1811248),
	// Text: When will I organize this all.
	WHEN_WILL_I_ORGANIZE_THIS_ALL(1811249),
	// Text: Hmm… is this still a decent weapon?
	HMM_IS_THIS_STILL_A_DECENT_WEAPON(1811247),
	// Text: Rumors say that these heroes have set unbelievable records.
	RUMORS_SAY_THAT_THESE_HEROES_HAVE_SET_UNBELIEVABLE_RECORDS(1811310),
	// Text: $s1! Come with me! I will lead you to Ibane.
	$S1_COME_WITH_ME_I_WILL_LEAD_YOU_TO_IBANE(1032301),
	// Text: Impressive looking statues.
	IMPRESSIVE_LOOKING_STATUES(1811261),
	// Text: According to this, records are broken every month.
	ACCORDING_TO_THIS_RECORDS_ARE_BROKEN_EVERY_MONTH(1811311),
	// Text: Shilen...
	SHILEN(1811283),
	// Text: We saw people use Sayune other than the Giant's Servants.
	WE_SAW_PEOPLE_USE_SAYUNE_OTHER_THAN_THE_GIANT_S_SERVANTS(11021701),
	// Text: It's because they have become Awaken… the power of the Giant's.
	IT_S_BECAUSE_THEY_HAVE_BECOME_AWAKEN_THE_POWER_OF_THE_GIANT_S(11021702),
	// Text: Duh, you can't use Sayune without powers of Giants in the first
	// place.
	DUH_YOU_CAN_T_USE_SAYUNE_WITHOUT_POWERS_OF_GIANTS_IN_THE_FIRST_PLACE(11021703),
	// Text: I think that's why many people come to visit Celphine.
	I_THINK_THAT_S_WHY_MANY_PEOPLE_COME_TO_VISIT_CELPHINE(11021704),
	// Text: After Ye Sagira fell there were many sacrifices made.
	AFTER_YE_SAGIRA_FELL_THERE_WERE_MANY_SACRIFICES_MADE(11021705),
	// Text: Didn't that release the seal on Hermuncus?
	DIDN_T_THAT_RELEASE_THE_SEAL_ON_HERMUNCUS(11021706),
	// Text: That's the rumor, but nothing to confirm it.
	THAT_S_THE_RUMOR_BUT_NOTHING_TO_CONFIRM_IT(11021707),
	// Text: It's got to be true, we need to find it.
	IT_S_GOT_TO_BE_TRUE_WE_NEED_TO_FIND_IT(11021708),
	// Text: Visit the Administration Office to complete your Class Transfers.
	VISIT_THE_ADMINISTRATION_OFFICE_TO_COMPLETE_YOUR_CLASS_TRANSFERS(1032353),
	// Text: Improve yourself faster at the Training Grounds.
	IMPROVE_YOURSELF_FASTER_AT_THE_TRAINING_GROUNDS(1032354),
	// Text: Begin Tutorial Quests
	BEGIN_TUTORIAL_QUEST(1600026),
	// Text: Newbie Helper has casted buffs on $s1.
	NEWBIE_HELPER_HAS_CASTED_BUFFS_ON_$S1(1600027),

	ACCESSORIES_HAVE_BEEN_ADDED_TO_YOUR_INVENTORY(11022201),

	HEY_KID_HARRY_UP_AND_FOLLOW_ME(1811265),
	TALK_TO_THAT_APPRENTICE_AND_GET_ON_KOOKARU(1811268),

	ARMOR_HAS_BEEN_ADDED_TO_YOUR_INVENTORY(11022202),

	YOU_ARE_TOO_FAR_FROM_CORPSE_TO_SHOW_YOUR_CONDOLENCES(10307000),

	YOU_SHOWN_YOUR_CONDOLENCES_TO_ONE_CORPSE(1036301),
	YOU_SHOWN_YOUR_CONDOLENCES_TO_SECOND_CORPSE(1036302),
	YOU_SHOWN_YOUR_CONDOLENCES_TO_THIRD_CORPSE(1036303),
	YOU_SHOWN_YOUR_CONDOLENCES_TO_FOURTH_CORPSE(1036304),
	YOU_SHOWN_YOUR_CONDOLENCES_TO_FIFTH_CORPSE(1036305),

	YOU_ARE_TOO_FAR_FROM_THE_CORPSE_TO_DO_THAT(1810363),
	GRUDGE_OF_YE_SAGIRA_VICTIMS_HAVE_BEEN_RELIEVED_WITH_YOUR_TEARS(1810364),

	DONT_TOY_WITH_DEAD(1036344),

	CATCH_UP_TO_KING_HES_WAITING(17178339),
	RUFF_RUFF_RRRRRR(17178340),
	YOU_MUST_MOVE_TO_EXPLORATION_AREA_5_IN_ORDER_TO_CONTINUE(17178341),
	KING_HAS_RETURNED_TO_DEF_RETURN_TO_DEF_AND_START_AGAIN(17178342),

	HAHAHA_YOU_DARE_TO_DISRUPT_ME_I_WILL_BE_YOUR_NIGHTMARE_FROM_WHICH_YOU_CAN_NEVER_AWAKEN(1801235),
	YOU_DARE_ATTACK_ME_I_WILL_FILL_YOUR_NIGHTMARES_WHITH_BLOOD(1801236),
	I_CANNOT_LET_YOU_STOP_THE_WRAITH_OF_SHILEN(1801237),
	ANSUCUBUS(1801238),
	HALT_YOURNIGHTMARES_WILL_FILL_YOU_WITH_DREAD(1801239),
	YOU_WONT_GET_AWAY(1801240),
	HOW_ALL__THAT_POWER_REMOED(1801241),
	SHILEN_I_HAVE_FAILED(1801242),
	TO_THINK_THAT_I_COULD_FAIL_IMPOSSIBLE(1801243),
	FREE_THE_GIANT_FROM_HIS_IMPRISONMENT_AND_AWAKEN_YOUR_TRUE_POWER(1811216),
	YOU_CANNOT_TELEPORT_WHILE_YOU_ARE_DEAD(1811318),

	MM_IM_SEE(1620051),
	THANK_YOU_FOR_THE_REPORT_ROGIN(1620052),
	SOLDIERS_WERE_FIGHTING_A_BATTLE_THAT_CANT_BE_WON(1620053),
	BUT_WE_HAVE_TO_DEFEND_OUR_VILLAGE_SO_WERE_FIGHTING(1620054),
	FOR_THE_FINE_WINES_AND_TREASURES_OF_ADEN(1620055),
	IM_PROUD_OF_EVERY_ONE_OF(1620056),
	UGH_IFI_SEE_YOU_IN_THE_SPIRIT_WORLD_FIRST_ROUND_IS_ON_ME(1620057),
	ROGIN_IM_HERE(1620058),
	BRONK(1620059),
	CHIEF(1620060),
	BRONK_(1620061),
	NO_WAY(1620062),
	FOR_BRONK(1620068),
	DWARVES_FOREVER(1620069),
	SAVE_THE_DWARVEN_VILLAGE(1620070),
	WHOAAAAAA(1620071),
	FIGHT(1620072),
	CHIEF_REPORTING_IN(1620073),
	ENEMIES_ARE_APPROACHING_FROM_THE_SOUTH(1620074),
	THE_ELDERS_HAVENT_BEEN_MOVED_TO_SAFETY(1620075),
	MANY_RESIDENTS_STILL_HAVENT_LEFT_THEIR_HOMES(1620076),
	CHIEF_(1620077),
	WATCH_THE_DWARVEN_VILLAGE_LAST_STAND(1620096),

	GAH_SHILEN_WHY_MUST_YOU_MAKE_US_SUFFER(50853),
	SHILEN_ABANDONED_US_IT_IS_OUR_TIME_TO_DIE(50854),
	WITH_OUR_SACRIFICE_WILL_WE_FULLFILL_THE_PROPHECY(50855),
	BLOODY_RAIN_PLAGUE_DEATH_SHE_IS_NEAR(50856),
	ARHHHH(50857),
	WE_OFFER_OUR_BLOOD_AS_A_SACRIFICE_SHILEN_SEE_US(50858),
	WILL_DARK_ELVES_BE_FORGOTTEN_AFTER_WHAT_WE_HAVE_DONE(50859),
	UNBELIEVERS_RUN_DEATH_WILL_FOLLOW_YOU(50860),
	I_CURSE_OUR_BLOOD_I_DESPISE_WHAT_WE_ARE_SHILEN(50861),

	MARK_OF_BELIS_CAN_BE_ACQUIRED_FROM_ENEMIES(1811199),
	ELECTRONIC_DEVICE_HAS_BEEN_DESTROYED(1811200),
	BEHIND_YOU_THE_ENEMY_IS_AMBUSING_YOU(1811194),
	IF_TERAIN_DIES_MISSION_WILL_FAIL(1811197),
	DONT_COME_BACK_HERE(1811217),

	IT_S_HERE(1811262),
	AN_INTRUDER_INTERESTING(10338011),
	PROVE_YOUR_WORTH(10338012),
	ONLY_THOSE_STRONG_ENOUGH_SHALL_PROCEED(10338013),
	ARE_YOU_AGAINST_THE_WILL_OF_LIGHT(10338014),
	COME_ATTACK_ME_IF_YOU_DARE(10338015),
	ARE_YOU_PLANNING_TO_BETRAY_THE_GODS_AND_FOLLOW_A_GIANT(10338016),
	ITS_THE_END_FOR_YOU_TRAITOR(10338017),
	HA_HA(10338018),
	I_WANT_TO_HEAR_YOU_CRY(10338019),
	MORTAL(10338020),
	LETS_SEE_WHAT_YOU_ARE_MADE_OF(10338021),
	YOU_WILL_NOT_FREE_HERMUNKUS(10338022),
	YOULL_HAVE_TO_KILL_US_FIRST(10338023),
	TRYING_TO_FREE_HERMUNCUS(10338024),
	REPENT_AND_YOU_DEATH_WILL_BE_QUICK(10338025),
	YOU_WILL_NEVER_BREAK_THE_SEAL(10338026),
	DIE_TRAITOR(10338027),
	ONLY_THE_LIGHT_MAY_PASS(10338028),
	YOU_ARE_NOT_LIGHT_YOU_MAY_NOT_PASS(10338029),
	RRECEIVE_THIS_POWER_FROM_THE_ANCIENT_GIANT(10338036),
	USE_THIS_NEW_POWER_WHEN_THE_TIME_IS_RIGHT(10338037),
	I_HERMUNKUS_GIVE_MY_POWER_TO_THOSE_WHO_FIGHT_FOR_ME(1811213),
	THOUGH_SMALL_THIS_POWER_WILL_HELP_YOU_GREATLY(1811214),
	_PROVE_YOUR_WORTH(10338030),
	ARE_YOU_STRONG_OR_WEAK_OF_THE_LIGHT_OR_DARKNESS(10338031),
	ONLY_THOSE_OF_LIGHT_MAY_PASS_OTHERS_MUST_PROVE_THEIR_STRENGTH(10338032),
	LETS_GET_THIS_OVER_WITH(1811181),
	I_MUST_GO_HELP_SOME_MORE(1811222),
	FREE_ME_FROM_THIS_BINDING_OF_LIGHT(10338006),
	DESTROY_THE_GHOST_OF_HARNAK_THIS_CORRUPTED_CREATURE(10338007),
	FREE_ME_AND_I_PROMISE_YOU_THE_POWER_OF_GIANTS(10338008),
	REMAINING_TIME(1811302),
	NO_THE_SEAL_CONTROLS_HAVE_BEEN_EXPOSED_GUARDS_PROTECT_THE_SEAL_CONTROLS(1811223),
	DISABLE_DEVICE_WILL_GO_OUT_OF_CONTROL_IN_1_MINUTE(1811226),
	_50_SECONDS_ARE_REMAINING(1811227),
	_40_SECONDS_ARE_REMAINING(1811228),
	_30_SECONDS_ARE_REMAINING(1811229),
	_20_SECONDS_ARE_REMAINING(1811230),
	_10_SECONDS_ARE_REMAINING(1811231),
	_5_SECONDS(1811232),
	_4_SECONDS(1811233),
	_3_SECONDS(1811234),
	_2_SECONDS(1811235),
	_1_SECOND(1811236),
	CANNON_READY_TO_FIRE(98704),
	YOU_MAY_USE_SCROLL_OF_AFTERLIFE_FROM_HERMUNCUS_TO_AWAKEN(10338010),
	ISTINA_SOUL_STONE_STARTS_POWERFULLY_ILLUMINATING_IN_RED(1811138),
	ISTINA_SOUL_STONE_STARTS_POWERFULLY_ILLUMINATING_IN_BLUE(1811139),
	ISTINA_SOUL_STONE_STARTS_POWERFULLY_ILLUMINATING_IN_GREEN(1811140),
	ISTINA_GETS_FURIOUS_AND_RECKLESSLY_CRAZY(1811141),
	BERSERKER_OF_ISTINA_HAS_BEEN_DISABLED(1811148),
	ISTINA_SPREADS_PROTECTIVE_SHEET(1811156),
	// Hein:Location Field Of Selence And Whispers
	// Message: Ah ah... From the Magic Force, no more... I will be freed
	AH_AH_FROM_THE_MAGIC_FORCE_NO_MORE_I_WILL_BE_FREED(1800874),
	// Message: Even the Magic Force binds you, you will never be forgiven...
	EVEN_THE_MAGIC_FORCE_BINDS_YOU_YOU_WILL_NEVER_BE_FORGIVEN(1800860),
	// Message: Protect the Braziers of Purity at all costs!!
	PROTECT_THE_BRAZIERS_OF_PURITY_AT_ALL_COSTS(1800855),
	// Message: The purification field is being attacked. Guardian Spirits!
	// Protect the Magic Force!!
	THE_PURIFICATION_FIELD_IS_BEING_ATTACKED_GUARDIAN_SPIRITS_PROTECT_THE_MAGIC_FORCE(1800854),
	// Message: Naia waganagel peutagun!
	NAIA_WAGANAGEL_PEUTAGUN(1800858),
	// Message: Target. Threat. Level. Launching. Strongest. Countermeasure.
	TARGET_THREAT_LEVEL_LAUNCHING_STRONGEST_COUNTERMEASURE(1800853),
	// Message: Drive device entire destruction moving suspension
	DRIVE_DEVICE_ENTIRE_DESTRUCTION_MOVING_SUSPENSION(1800873),
	// Message: Drive device partial destruction impulse result
	DRIVE_DEVICE_PARTIAL_DESTRUCTION_IMPULSE_RESULT(1800859),
	// Message: Defend our domain even at risk of your own life!
	DEFEND_OUR_DOMAIN_EVEN_AT_RISK_OF_YOUR_OWN_LIFE(1800856),
	// Message: Peunglui muglanep Naia waganagel peutagun!
	PEUNGLUI_MUGLANEP_NAIA_WAGANAGEL_PEUTAGUN(1800872),
	// Message: Peunglui muglanep!
	PEUNGLUI_MUGLANEP(1800857),
	// Message: Target recognition achieved. Attack sequence commencing.
	TARGET_RECOGNITION_ACHIEVED_ATTACK_SEQUENCE_COMMENCING(1800852),
	// Message: Alert! Alert! Damage detection recognized. Countermeasures
	// enabled.
	ALERT_ALERT_DAMAGE_DETECTION_RECOGNIZED_COUNTERMEASURES_ENABLED(1800851),
	DARK_POWER_SEEPS_OUT_FROM_THE_MIDDLE_OF_THE_TOWN(8888106),
	// Message: You win if you get to Ye Sagira Ruins first.
	YOU_WIN_IF_YOU_GET_TO_YE_SAGIRA_RUINS_FIRST(1600028),
	// Message: After $s1 seconds, the charging magic Ballistas starts.
	AFTER_$s1_SECONDS_THE_CHARGING_MAGIC_BALLISTAS_STARTS(1811155),
	// Message: Ah man, you beat me!
	AH_MAN_YOU_BEAT_ME(1600029),
	// Message: Too bad. Try again.
	TOO_BAD_TRY_AGAIN(1600030),
	// Message: Come on~!! Creek~
	COME_ON_CREEK(1032307),
	ISTHINA_ABORT_SELF(1811141),
	// Message: I hit things… they fall dead.
	I_HIT_THINGS_THEY_FALL_DEAD(1034101),
	// Message: I can heal you during combat.
	I_CAN_HEAL_YOU_DURING_COMBAT(1034102),
	// Message: My summons are not afraid of Shilen's monsters.
	MY_SUMMONS_ARE_NOT_AFRAID_OF_SHILENS_MONSTER(1034103),
	// Message: What do I feel when I kill Shilen's monsters? Recoil.
	WHAT_DO_I_FEEL_WHEN_I_KILL_SHILENS_MONSTERS_RECOIL(1034104),
	// Message: Creatures Resurrected - Defend Yourself
	CREATURES_RESURECTED_DEFEND_YOURSELF(1034105),
	// Message: Creatures have stopped their attack. Rest and then speak with Adolph.
	CREATURES_HAVE_STOPPER_THEIR_ATTACK_REST_AND_THEN_SPEEAK_WITH_ADOLPH(1034113),
	// Message: I, Death Wound... Champion of Shilen, shall end your world.
	I_DEATH_WOUND_CHAMPION_OF_SHILEN_SHALL_END_YOUR_WORLD(1034116),
	// Message: Agh... humans... ha... it does not matter, your world will end anyways.
	AGH_HUMANS_HA_IT_DOES_NOT_MATTER_YOUR_WORLD_WILL_END_ANYWAYS(1034117),
	// Message: Get behind me! Get behind me!
	GET_BEHIND_ME_GET_BEHIND_ME(1034118),
	// Message: The only good Shilen Creature, is a dead one.
	THE_ONLY_GOOD_SHILEN_CREATURE_IS_A_DEAD_ONE(1034119),
	// Message: Did someone cry medic? Here, be healed!
	DID_SOMEONE_CRY_MEDIC_HERE_BE_HEALED(1034120),
	// Message: I'm on fire! No wait, that would be you...
	I_M_ON_FIRE_NO_WAIT_THAT_WOULD_BE_YOU(1034121),
	// Message: Boom! Headshot!
	BOOM_HEADSHOT(1034122),
	// Message: The Cry of Fate pendant will be helpful to you. Please equip it and bring out the power of the pendant to prepare for the next fight.
	THE_CRY_OF_FATE_PENDANT_WILL_BE_HELPFUL_TO_YOU_PLEASE_EQUIP_IT_AND_BRING_OUT_THE_POWER_OF_THE_PENDANT_TO_PREPARE_FOR_THE_NEXT_FIGHT(1034124),
	// Message: Creatures have stopped attacking. Use this time to rest and recover!
	CREATURES_HAVE_STOPPED_ATTACKING_USE_THIS_TIME_TO_REST_AND_RECOVER(1034123),
	// Message: You cannot teleport in party status.
	YOU_CANNOT_TELEPORT_IN_PARTY_STATUS(1811239),
	
	// Message: Everyone die!
	EVERYONE_DIE(1801599),
	// Message: For Tauti!
	FOR_TAUTI(1801600),
	// Message: Fools. I will make this a habitat for the rats. They shall feed on your body!
	FOOLS_I_WILL_MAKE_THIS_A_HABIAR_FOR_THE_RATS_THEY_SHALL_FEED_ON_YOUT_BODY(1801601),
	// Message: How dare you insects attack me?
	HOW_DARE_YOU_INSECTS_ATTACK_ME(1801602),
	// Message: You rat-like creatures!
	YOU_RAT_LIKE_CREATURES(1801603),
	// Message: Today, my weapon will feast on your Petras.
	TODAY_MY_WEAPON_WILL_FEAST_ON_YOUR_PETRAS(1801604),
	// Message: Hahahaha hahahaha puny insects!
	HAHAHAHA_HAHAHAHA_PUNY_INSECTS(1801605),
	// Message: I will punish you in the name of Tauti! The crime is stealing. The punishment is death!
	I_WILL_PUNISH_YOU_IN_THE_NAME_TAUTI_THE_CRIME_IS_STEALING_THE_PUNISHMENT_IS_DEATH(1801608),
	// Message: Fight for the sake of our future!
	FIGHT_FOR_THE_SAKE_OF_OUR_FUTURE(1801609),
	// Message: Even rats struggle when you step on them!
	EVEN_RATS_STRUNGGLE_WHEN_YOU_STEP_ON_THEM(1801610),

	// Message: For our friends and family!
	FOR_OUR_FRIENDS_AND_FAMILY(1801611),
	// Message: You kundanomus! My weapon isn't great, but I will still cut off your heads with it!
	YOU_KUNDANOMUS_MY_WEAPON_ISNT_GREAT_BUT_I_WILL_STILL_CUT_OFF_YOUR_HEADS_WITH_IT(1801612),
	// Message: Give me freedom or give me death!
	GIVE_ME_FREEDOM_OR_GIVE_ME_DEATH(1801613),
	// Message: Us! Today! Here! We shall write new history by defeating Tauti! For freedom and happiness!
	US_TODAY_HERE_WE_SHALL_WRITE_HISTORY_BY_DEFEATING_TAUTI_FOR_FREEDOM_AND_HAPPINESS(1801614),
	// Message: We are not your pets or cattle!
	WE_ARE_NOT_YOUR_PETS_OR_CATTLE(1801615),
	// Message: You will die!     And I will live.
	YOU_WILL_DIE_AND_I_WILL_LIVE(1801616),
	// Message: We cannot forgive Tauti for feeding on us anymore!
	WE_CANNOT_FORGIVE_TAUTI_FOR_FEEDING_ON_US_ANYMORE(1801617),
	// Message: If we all fall here, our plan will certainly fail. Please protect my friends.
	IF_WE_ALL_FALL_HERE_OUR_PLAN_WILL_CERTAINLY_FAIL_PLEASE_PROTECT_MY_FRIENDS(1801619),
	// Message: Jahak is infusing its Petra to Tauti
	JAHAK_IS_INFUSING_ITS_PETRA_TO_TAUTI(1801649),
	// Message: Lord Tauti, receive my Petra and be strengthened. Then, defeat these feeble wretches!
	LORD_TAUTI_REVEIVE_MY_PETRA_AND_BE_STRENGTHENED_THEN_DEFEAT_THESE_FEEBLE_WRETCHES(1801650),
	// Message: Installation charge.
	INSTALLATION_CHARGE(2621101),
	// Message: Location Portal changed. 
	LOCATION_PORTAL_CHANGED(1811150),
	// Message: The door opened. Someone has to stay and watch for a time bomb
	THE_DOOR_OPENED_SOMEONE_HAS_TO_STAY_AND_WATCH_FOR_A_TIME_BOMB(1811152),
	// Message: The door opened.
	THE_DOOR_OPENED(1811154),
	// Message: Rescued changes state only after exposure to light it
	RESCUED_CHANGES_STATE_ONLY_AFTER_EXPOSURE_TO_LIGHT_IT(1811153),
	// Message: There's a noble king who did not fall before the hammer of old gods
	THERES_A_NOBLE_KING_WHO_DID_NOT_FALL_BEFORE_THE_HAMMER_OF_OLD_GODS(1622001),
	// Message: All the giants trusted their lives on that courage.
	ALL_THE_GIGANTS_TRUSTED_THEIR_LIVES_ON_THAT_COURAGE(1622002),
	// Message: Saving the lives with beautiful lady Belis, Slashing the Gods
	SAVING_THE_LIVES_WITH_BEAUTIFUL_LADY_BELIS_SLASHING_THE_GODS(1622003),
	// Message: Even the five dragons of darkness swallowed the flames in reverence
	EVEN_THE_FIVE_DRAGONS_OF_DARKNESS_SWALLOWED_THE_FLAMES_IN_REVERENCE(1622004),
	// Message: Sword rusts and magic is forgotten
	SWORD_RUSTS_AND_MAGIC_IS_FORGOTTEN(1622005),
	// Message: Lady goes under the veil and the king falls on the dust
	LADY_GOES_UNDER_THE_VEIL_AND_THE_KING_FALLS_ON_THE_DUST(1622006),
	// Message: Who remembers the halls of Harnak and powers of platinum
	WHO_REMEMBERS_THE_HALLS_OF_HARNAK_AND_POWERS_OF_PLATINUM(1622007),
	// Message: Only the souls left to weep in the arms of eight knights
	ONLY_THE_SOULS_LEFT_TO_WEEP_IN_THE_ARMS_OF_EIGHT_KNIGHTS(1622008),
	// Message: All seals have been broken. Ghost of Harnak will appear soon.
	ALL_SEALS_HAVE_BEEN_BROKEN_GHOST_OF_HARNAK_WILL_APPEAR_SOON(1622201),
	// Message: All jails are open. Ghost of Harnak will appear soon
	ALL_JAILS_ARE_OPEN_GHOST_OF_HARNAK_WILL_APPEAR_SOON(1622202),
	// Message: Ghost of Harnak can only be hit near Soul Circle.
	GHOST_OF_HARNAK_CAN_ONLY_BE_HIT_NEAR_SOUL_CIRCLE(1622203),
	// Message: Chaos Shield breakthrough!!
	CHAOS_SHIELD_BREAKTHROUGH(1801773),
    // Message: Nothing comes out neither from inside or outside.
    NOTHING_COMES_OUT_NEITHER_FROM_INSIDE_OR_OUSIDE(1900190),
    // Message: As it didn't exist
    AS_IT_DIDNT_EXIST(1900191),
    // Message: It left nothing behind..
    IT_LEFT_NOTHING_BEHIND(1900192),
    // Message: Should we report it to the kingdom?
    SHOULD_VE_REPORT_IT_TO_THE_KINGDOM(1900193),
    // Message: I'm in a pickle. We can't go back. Let's look further.
    IM_IN_A_PICKLE_WE_CANT_GO_BACK_LETS_LOOK_FURTHER(1900194),
    // Message: We'll begin internal purification process.
    WELL_BEGIN_INTERNAL_PURIFICATION_PROCESS(1900195),
	    They_managed_to_do_everything_on_the_first_try(1030101),
    The_job_can_start_with_the_old_scroll_of_items(530400),
	Success_destroying(1801198),
	Success_destroying_open_door(1801199),
	Lost_Time(1911119),
	Left_Time(1911120),
    
    CREATURES_RESURRECTED_NONE_WAVE(1034105),
    CREATURES_RESURRECTED_FIRST_WAVE(1034106),
    CREATURES_RESURRECTED_SECOND_WAVE(1034107),
    CREATURES_RESURRECTED_THIRD_WAVE(1034108),
    CREATURES_RESURRECTED_FOURTH_WAVE(1034109),
    CREATURES_RESURRECTED_FIFTH_WAVE(1034110),
    CREATURES_RESURRECTED_DEFEND_YOURSELF(1034111),
    CREATURES_RESURRECTED_DEATH_WOUND_HAS_BEEN_SUMMONED(1034112),
    CREATURES_HAVE_STOPPED_THEIR_ATTACK_REST_AND_THEN_SPEAK_WITH_ADOLPH(1034113),
	WHO_POTR_OUR_SAFETY(8888002),
	STAGE_1(8888017),
	STAGE_2(8888018),
	STAGE_3(8888019),
	STAGE_4(8888020),
	STAGE_5(8888021),
	STAGE_6(8888022),
	STAGE_7(8888023),
	STAGE_8(8888024),
	LAST_STAGE(8888025),
	BONUS_STAGE(8888026),
	PLAKSA(8888027),
	MUKSHUANDHOPNAP(8888028),
	KINEN(8888029),
	RESINA(8888030),
	KONYAR(8888031),
	YOTEMAK(8888032),
	BEZMOLVYJAS(8888033),
	AETTEKTO(8888003),
	POGLOTITESVET(8888004),
	POSMOTRIM(8888005),
	NEBOITESSMERTI(8888006),
	VSETOLKONACHINAETSA(8888007),
	POGLOTIVSE(8888008),
	VELIKOPLEPNO(8888009),
	PRIDETSAZANYATSAETIM(8888010),
	ZAVECHNIYPOKOI(8888011),
	ESLIRAZBITSVETSFERA(8888012),
	PRIDETSAOTPRAVITNEMNOGO(8888013),
	PRIZOVYSFERY(8888014),
	NEMNOGODAYTESILA(8888015),
	VOSKRESHVOINS(8888016),
    // Message: Please.
    PLEASE_33381(1900196);	

	private final int _id;
	private final int _size;

	NpcString(int id)
	{
		_id = id;

		if (name().contains("S4"))
			_size = 4;
		else if (name().contains("S3"))
			_size = 3;
		else if (name().contains("S2"))
			_size = 2;
		else if (name().contains("S1"))
			_size = 1;
		else
			_size = 0;
	}

	public int getId()
	{
		return _id;
	}

	public int getSize()
	{
		return _size;
	}

	public static NpcString valueOf(int id)
	{
		for (NpcString m : values())
			if (m.getId() == id)
				return m;

		throw new NoSuchElementException("Not find NpcString by id: " + id);
	}
}
