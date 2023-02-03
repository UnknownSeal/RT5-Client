import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class PlayerAppearance {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_BODY_COLORS = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[S")
	public static final short[] GAME1_SOURCE_BODY_COLORS = new short[] { 960, 957, -21568, -21571, 22464 };
	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[S")
	public static final short[] GAME0_SOURCE_BODY_COLORS = new short[] { 6798, 8741, 25238, 4626, 4550 };
	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[[S")
	public static final short[][] GAME0_DESTINATION_SKIN_COLORS = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[S")
	public static final short[] GAME0_SOURCE_SKIN_COLORS = new short[] { -10304, 9104, -1, -1, -1 };
	@OriginalMember(owner = "client!bo", name = "c", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_SKIN_COLORS = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
	@OriginalMember(owner = "client!gl", name = "D", descriptor = "[S")
	public static final short[] GAME1_SOURCE_SKIN_COLORS = new short[] { -4160, -4163, -8256, -8259, 22461 };
	@OriginalMember(owner = "client!lp", name = "h", descriptor = "[[S")
	public static final short[][] GAME1_DESTINATION_BODY_COLORS = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };
	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
	public static final int[] BASE_PART_MAP = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
	@OriginalMember(owner = "client!uo", name = "J", descriptor = "[I")
	public static final int[] FEMALE_FEATURES = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
	public static final int[] MALE_FEATURES = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Z")
	public boolean female;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "[I")
	private int[] idendityKit;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	private int basID;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[I")
	public int[] colors;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "J")
	private long checksum;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	public int npcID = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([I[IZIIZ)V")
	public void method3179(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.female = arg2;
		if (this.basID != arg4) {
			this.basID = arg4;
			this.anIntArrayArray24 = null;
		}
		this.idendityKit = arg1;
		this.colors = arg0;
		this.npcID = arg3;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!e;III)V")
	public void method3180(@OriginalArg(0) IdentityKitTypeList identityKitTypeList, @OriginalArg(1) int i, @OriginalArg(3) int identityKit) {
		@Pc(7) int part = BASE_PART_MAP[i];
		if (this.idendityKit[part] != 0 && identityKitTypeList.get(identityKit) != null) {
			this.idendityKit[part] = Integer.MIN_VALUE | identityKit;
			this.updateChecksum();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V")
	public void setGender(@OriginalArg(0) boolean arg0) {
		this.female = arg0;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!gp;Lclient!wl;ZIILclient!nb;Lclient!ta;Lclient!e;Lclient!wm;ILclient!io;)Lclient!gn;")
	public Model method3183(@OriginalArg(0) int arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class157 arg4, @OriginalArg(7) Class219 arg5, @OriginalArg(8) IdentityKitTypeList arg6, @OriginalArg(9) Class19 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) ObjTypeList arg9) {
		if (this.npcID != -1) {
			return arg5.get(this.npcID).getHeadModel(arg3, arg8, arg0, arg7, arg4, arg2, arg1);
		}
		@Pc(27) int local27 = 1024;
		@Pc(35) boolean local35;
		@Pc(46) int local46;
		@Pc(109) int local109;
		@Pc(56) int local56;
		@Pc(113) int local113;
		if (arg4 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			local46 = arg4.frames[arg0];
			local27 = 1056;
			local56 = local46 >>> 16;
			@Pc(60) int local60 = local46 & 0xFFFF;
			@Pc(65) Class2_Sub2_Sub13 local65 = arg1.method2368(local56);
			if (local65 != null) {
				local33 = local65.method4236(local60) | false;
				local31 = local65.method4234(local60) | false;
				local35 = arg4.aBoolean263 | false;
			}
			if ((arg4.tween || Static318.forceTween) && arg8 != -1 && arg8 < arg4.frames.length) {
				local109 = arg4.frames[arg8];
				local113 = local109 >>> 16;
				@Pc(117) int local117 = local109 & 0xFFFF;
				@Pc(127) Class2_Sub2_Sub13 local127 = local113 == local56 ? local65 : arg1.method2368(local113);
				if (local127 != null) {
					local33 |= local127.method4236(local117);
					local31 |= local127.method4234(local117);
				}
			}
			if (local33) {
				local27 = 1184;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
		}
		@Pc(163) SoftLruHashTable local163 = Static349.A_SOFT_LRU_HASH_TABLE___58;
		@Pc(172) Model local172;
		synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
			local172 = (Model) Static349.A_SOFT_LRU_HASH_TABLE___58.get(this.checksum);
		}
		if (local172 == null || arg7.method2863(local172.method3826(), local27) != 0) {
			if (local172 != null) {
				local27 = arg7.method2806(local27, local172.method3826());
			}
			local35 = false;
			for (local46 = 0; local46 < 12; local46++) {
				local109 = this.idendityKit[local46];
				if ((local109 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local109) != 0 && !arg6.get(local109 & 0x3FFFFFFF).isHeadModelReady()) {
						local35 = true;
					}
				} else if (!arg9.get(local109 & 0x3FFFFFFF).isHeadModelReady(this.female)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(260) RawModel[] local260 = new RawModel[12];
			@Pc(262) int local262 = 0;
			for (@Pc(264) int local264 = 0; local264 < 12; local264++) {
				local56 = this.idendityKit[local264];
				@Pc(286) RawModel local286;
				if ((local56 & 0x40000000) != 0) {
					local286 = arg9.get(local56 & 0x3FFFFFFF).method4777(this.female);
					if (local286 != null) {
						local260[local262++] = local286;
					}
				} else if ((Integer.MIN_VALUE & local56) != 0) {
					local286 = arg6.get(local56 & 0x3FFFFFFF).getHeadModel();
					if (local286 != null) {
						local260[local262++] = local286;
					}
				}
			}
			@Pc(325) RawModel local325 = new RawModel(local260, local262);
			@Pc(329) int local329 = local27 | 0x2000;
			local172 = arg7.method2864(local325, local329, Static233.anInt4199, 64, 768);
			for (local113 = 0; local113 < 5; local113++) {
				if (this.colors[local113] < Static353.aShortArrayArray7[local113].length) {
					local172.method3837(Static10.sourceBodyColors[local113], Static353.aShortArrayArray7[local113][this.colors[local113]]);
				}
				if (Static186.aShortArrayArray6[local113].length > this.colors[local113]) {
					local172.method3837(Static43.aShortArray20[local113], Static186.aShortArrayArray6[local113][this.colors[local113]]);
				}
			}
			local172.method3813(local27);
			@Pc(398) SoftLruHashTable local398 = Static349.A_SOFT_LRU_HASH_TABLE___58;
			synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
				Static349.A_SOFT_LRU_HASH_TABLE___58.put(this.checksum, local172);
			}
		}
		if (arg4 == null) {
			return local172;
		} else {
			local172.method3799((byte) 4, local27, true);
			return arg4.method3985(local172, arg0, 1024, arg3, arg8);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!e;ILclient!nb;IIILclient!gp;Lclient!wm;II)Lclient!gn;")
	public Model method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IdentityKitTypeList arg2, @OriginalArg(4) Class157 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class85 arg6, @OriginalArg(9) Class19 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg3 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg3.frames[arg8];
			local36 = local32 >>> 16;
			@Pc(40) int local40 = local32 & 0xFFFF;
			@Pc(45) Class2_Sub2_Sub13 local45 = arg6.method2368(local36);
			if (local45 != null) {
				local13 = local45.method4236(local40) | false;
				local11 = local45.method4234(local40) | false;
				local15 = arg3.aBoolean263 | false;
			}
			if ((arg3.tween || Static318.forceTween) && arg4 != -1 && arg3.frames.length > arg4) {
				@Pc(84) int local84 = arg3.frames[arg4];
				@Pc(88) int local88 = local84 >>> 16;
				@Pc(92) int local92 = local84 & 0xFFFF;
				@Pc(108) Class2_Sub2_Sub13 local108;
				if (local88 == local36) {
					local108 = local45;
				} else {
					local108 = arg6.method2368(local92 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method4236(local92);
					local11 |= local108.method4234(local92);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(160) long local160 = (long) (arg1 << 16) | (long) arg0 << 32 | (long) arg5;
		@Pc(162) SoftLruHashTable local162 = Static349.A_SOFT_LRU_HASH_TABLE___58;
		@Pc(170) Model local170;
		synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
			local170 = (Model) Static349.A_SOFT_LRU_HASH_TABLE___58.get(local160);
		}
		if (local170 == null || arg7.method2863(local170.method3826(), local7) != 0) {
			if (local170 != null) {
				local7 = arg7.method2806(local7, local170.method3826());
			}
			@Pc(197) RawModel[] local197 = new RawModel[3];
			@Pc(199) int local199 = 0;
			if (!arg2.get(arg5).isHeadModelReady() || !arg2.get(arg1).isHeadModelReady() || !arg2.get(arg0).isHeadModelReady()) {
				return null;
			}
			@Pc(227) RawModel local227 = arg2.get(arg5).getHeadModel();
			if (local227 != null) {
				local199++;
				local197[0] = local227;
			}
			local227 = arg2.get(arg1).getHeadModel();
			if (local227 != null) {
				local197[local199++] = local227;
			}
			local227 = arg2.get(arg0).getHeadModel();
			if (local227 != null) {
				local197[local199++] = local227;
			}
			local227 = new RawModel(local197, local199);
			local32 = local7 | 0x2000;
			local170 = arg7.method2864(local227, local32, Static233.anInt4199, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static353.aShortArrayArray7[local36].length > this.colors[local36]) {
					local170.method3837(Static10.sourceBodyColors[local36], Static353.aShortArrayArray7[local36][this.colors[local36]]);
				}
				if (Static186.aShortArrayArray6[local36].length > this.colors[local36]) {
					local170.method3837(Static43.aShortArray20[local36], Static186.aShortArrayArray6[local36][this.colors[local36]]);
				}
			}
			local170.method3813(local7);
			@Pc(347) SoftLruHashTable local347 = Static349.A_SOFT_LRU_HASH_TABLE___58;
			synchronized (Static349.A_SOFT_LRU_HASH_TABLE___58) {
				Static349.A_SOFT_LRU_HASH_TABLE___58.put(local160, local170);
			}
		}
		if (arg3 == null) {
			return local170;
		} else {
			local170 = local170.method3799((byte) 4, local7, true);
			return arg3.method3985(local170, arg8, 1024, arg9, arg4);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public void setColor(@OriginalArg(1) int i, @OriginalArg(2) int color) {
		this.colors[i] = color;
		this.updateChecksum();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
	private void updateChecksum() {
		@Pc(7) long[] CRC64_TABLE = Buffer.CRC64_TABLE;
		this.checksum = -1L;
		this.checksum = CRC64_TABLE[(int) ((this.checksum ^ (long) (this.basID >> 8)) & 0xFFL)] ^ this.checksum >>> 8;
		this.checksum = CRC64_TABLE[(int) ((this.checksum ^ (long) this.basID) & 0xFFL)] ^ this.checksum >>> 8;
		for (@Pc(54) int i = 0; i < 12; i++) {
			this.checksum = CRC64_TABLE[(int) (((long) (this.idendityKit[i] >> 24) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
			this.checksum = CRC64_TABLE[(int) (((long) (this.idendityKit[i] >> 16) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
			this.checksum = CRC64_TABLE[(int) (((long) (this.idendityKit[i] >> 8) ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
			this.checksum = CRC64_TABLE[(int) (((long) this.idendityKit[i] ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
		}
		for (@Pc(150) int i = 0; i < 5; i++) {
			this.checksum = CRC64_TABLE[(int) (((long) this.colors[i] ^ this.checksum) & 0xFFL)] ^ this.checksum >>> 8;
		}
		this.checksum = this.checksum >>> 8 ^ CRC64_TABLE[(int) (((long) (this.female ? 1 : 0) ^ this.checksum) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLclient!ak;Lclient!gp;Lclient!e;Lclient!nb;IIIIZILclient!nb;Lclient!wl;Lclient!io;Lclient!wm;Lclient!ta;[Lclient!bg;I)Lclient!gn;")
	public Model getBodyModel(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class85 arg2, @OriginalArg(4) IdentityKitTypeList arg3, @OriginalArg(5) Class157 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class157 arg10, @OriginalArg(13) Interface11 arg11, @OriginalArg(14) ObjTypeList arg12, @OriginalArg(15) Class19 arg13, @OriginalArg(16) Class219 arg14, @OriginalArg(17) Class20[] arg15, @OriginalArg(18) int arg16) {
		if (this.npcID != -1) {
			return arg14.get(this.npcID).getBodyModel(arg1, arg16, arg4, arg13, arg2, arg6, arg9, arg8, arg10, arg7, arg15, arg0, arg11, arg5);
		}
		@Pc(33) int local33 = arg7;
		@Pc(36) long checksum = this.checksum;
		@Pc(39) int[] identityKit = this.idendityKit;
		if (arg4 != null && (arg4.mainhand >= 0 || arg4.offhand >= 0)) {
			identityKit = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				identityKit[local52] = this.idendityKit[local52];
			}
			if (arg4.mainhand >= 0) {
				if (arg4.mainhand == 65535) {
					checksum ^= 0xFFFFFFFF00000000L;
					identityKit[5] = 0;
				} else {
					identityKit[5] = arg4.mainhand | 0x40000000;
					checksum ^= (long) identityKit[5] << 32;
				}
			}
			if (arg4.offhand >= 0) {
				if (arg4.offhand == 65535) {
					identityKit[3] = 0;
					checksum ^= 0xFFFFFFFFL;
				} else {
					identityKit[3] = arg4.offhand | 0x40000000;
					checksum ^= identityKit[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(149) boolean local149 = arg4 != null || arg10 != null;
		@Pc(156) int local156 = arg15 == null ? 0 : arg15.length;
		@Pc(190) int local190;
		@Pc(195) int local195;
		for (@Pc(158) int local158 = 0; local158 < local156; local158++) {
			Static41.aClass2_Sub2_Sub13Array2[local158] = null;
			if (arg15[local158] != null) {
				@Pc(176) Class157 local176 = arg2.method2371(arg15[local158].anInt624);
				if (local176.frames != null) {
					Static114.aClass157Array14[local158] = local176;
					local149 = true;
					local190 = arg15[local158].anInt628;
					local195 = arg15[local158].anInt627;
					@Pc(200) int local200 = local176.frames[local190];
					Static41.aClass2_Sub2_Sub13Array2[local158] = arg2.method2368(local200 >>> 16);
					@Pc(213) int local213 = local200 & 0xFFFF;
					Static81.anIntArray219[local158] = local213;
					if (Static41.aClass2_Sub2_Sub13Array2[local158] != null) {
						local141 |= Static41.aClass2_Sub2_Sub13Array2[local158].method4236(local213);
						local139 |= Static41.aClass2_Sub2_Sub13Array2[local158].method4234(local213);
					}
					if ((local176.tween || Static318.forceTween) && local195 != -1 && local176.frames.length > local195) {
						Static296.anIntArray381[local158] = local176.frameDelay[local190];
						Static316.anIntArray396[local158] = arg15[local158].anInt625;
						@Pc(290) int local290 = local176.frames[local195];
						Static385.aClass2_Sub2_Sub13Array4[local158] = arg2.method2368(local290 >>> 16);
						@Pc(303) int local303 = local290 & 0xFFFF;
						Static341.anIntArray429[local158] = local303;
						if (Static385.aClass2_Sub2_Sub13Array4[local158] != null) {
							local141 |= Static385.aClass2_Sub2_Sub13Array4[local158].method4236(local303);
							local139 |= Static385.aClass2_Sub2_Sub13Array4[local158].method4234(local303);
						}
					} else {
						Static296.anIntArray381[local158] = 0;
						Static316.anIntArray396[local158] = 0;
						Static385.aClass2_Sub2_Sub13Array4[local158] = null;
						Static341.anIntArray429[local158] = -1;
					}
				}
			}
		}
		@Pc(339) int local339 = -1;
		local190 = -1;
		local195 = 0;
		@Pc(345) Class2_Sub2_Sub13 local345 = null;
		@Pc(347) Class2_Sub2_Sub13 local347 = null;
		@Pc(349) int local349 = -1;
		@Pc(351) int local351 = -1;
		@Pc(353) int local353 = 0;
		@Pc(355) Class2_Sub2_Sub13 local355 = null;
		@Pc(357) Class2_Sub2_Sub13 local357 = null;
		if (local149) {
			@Pc(370) int local370;
			@Pc(427) int local427;
			if (arg4 != null) {
				local339 = arg4.frames[arg16];
				local370 = local339 >>> 16;
				local339 &= 0xFFFF;
				local345 = arg2.method2368(local370);
				if (local345 != null) {
					local141 |= local345.method4236(local339);
					local139 |= local345.method4234(local339);
				}
				if ((arg4.tween || Static318.forceTween) && arg5 != -1 && arg5 < arg4.frames.length) {
					local195 = arg4.frameDelay[arg16];
					local190 = arg4.frames[arg5];
					local427 = local190 >>> 16;
					local347 = local427 == local370 ? local345 : arg2.method2368(local427);
					local190 &= 0xFFFF;
					if (local347 != null) {
						local141 |= local347.method4236(local190);
						local139 |= local347.method4234(local190);
					}
				}
			}
			local33 = arg7 | 0x20;
			if (arg10 != null) {
				local349 = arg10.frames[arg9];
				local370 = local349 >>> 16;
				local355 = arg2.method2368(local370);
				local349 &= 0xFFFF;
				if (local355 != null) {
					local141 |= local355.method4236(local349);
					local139 |= local355.method4234(local349);
				}
				if ((arg10.tween || Static318.forceTween) && arg8 != -1 && arg8 < arg10.frames.length) {
					local353 = arg10.frameDelay[arg9];
					local351 = arg10.frames[arg8];
					local427 = local351 >>> 16;
					local351 &= 0xFFFF;
					local357 = local370 == local427 ? local355 : arg2.method2368(local427);
					if (local357 != null) {
						local141 |= local357.method4236(local351);
						local139 |= local357.method4234(local351);
					}
				}
			}
			if (local141) {
				local33 |= 0x80;
			}
			if (local139) {
				local33 |= 0x100;
			}
		}
		@Pc(581) SoftLruHashTable local581 = Static92.bodyModels;
		@Pc(589) Model local589;
		synchronized (Static92.bodyModels) {
			local589 = (Model) Static92.bodyModels.get(checksum);
		}
		@Pc(597) BasType local597 = null;
		if (this.basID != -1) {
			local597 = arg1.method245(this.basID);
		}
		@Pc(640) int local640;
		@Pc(646) int local646;
		if (local589 == null || arg13.method2863(local589.method3826(), local33) != 0 || local597 != null && local597.equipmentTransforms != null && this.anIntArrayArray24 == null) {
			if (local589 != null) {
				local33 = arg13.method2806(local33, local589.method3826());
			}
			@Pc(638) boolean local638 = false;
			local640 = 0;
			while (true) {
				if (local640 >= 12) {
					if (local638) {
						if (this.aLong106 != -1L) {
							@Pc(696) SoftLruHashTable local696 = Static92.bodyModels;
							synchronized (Static92.bodyModels) {
								local589 = (Model) Static92.bodyModels.get(this.aLong106);
							}
						}
						if (local589 == null || arg13.method2863(local589.method3826(), local33) != 0 || local597 != null && local597.equipmentTransforms != null && this.anIntArrayArray24 == null) {
							return null;
						}
					} else {
						@Pc(735) RawModel[] local735 = new RawModel[12];
						@Pc(743) int local743;
						for (@Pc(737) int local737 = 0; local737 < 12; local737++) {
							local743 = identityKit[local737];
							@Pc(763) RawModel local763;
							if ((local743 & 0x40000000) != 0) {
								local763 = arg12.get(local743 & 0x3FFFFFFF).method4778(this.female);
								if (local763 != null) {
									local735[local737] = local763;
								}
							} else if ((local743 & Integer.MIN_VALUE) != 0) {
								local763 = arg3.get(local743 & 0x3FFFFFFF).getBodyModel();
								if (local763 != null) {
									local735[local737] = local763;
								}
							}
						}
						@Pc(821) int local821;
						if (local597 != null && local597.equipmentTransforms != null) {
							for (local743 = 0; local743 < local597.equipmentTransforms.length; local743++) {
								if (local597.equipmentTransforms[local743] != null && local735[local743] != null) {
									local821 = local597.equipmentTransforms[local743][0];
									@Pc(828) int local828 = local597.equipmentTransforms[local743][1];
									@Pc(835) int local835 = local597.equipmentTransforms[local743][2];
									@Pc(844) int local844 = local597.equipmentTransforms[local743][3] << 3;
									@Pc(853) int local853 = local597.equipmentTransforms[local743][4] << 3;
									@Pc(862) int local862 = local597.equipmentTransforms[local743][5] << 3;
									if (this.anIntArrayArray24 == null) {
										this.anIntArrayArray24 = new int[local597.equipmentTransforms.length][];
									}
									if (this.anIntArrayArray24[local743] == null) {
										@Pc(884) int[] local884 = this.anIntArrayArray24[local743] = new int[15];
										if (local844 == 0 && local853 == 0 && local862 == 0) {
											local884[13] = -local828;
											local884[12] = -local821;
											local884[0] = local884[4] = local884[8] = 32768;
											local884[14] = -local835;
										} else {
											@Pc(894) int local894 = Class19.COSINE[local844];
											@Pc(898) int local898 = Class19.SINE[local844];
											@Pc(902) int local902 = Class19.COSINE[local853];
											@Pc(906) int local906 = Class19.SINE[local853];
											@Pc(910) int local910 = Class19.COSINE[local862];
											@Pc(914) int local914 = Class19.SINE[local862];
											@Pc(922) int local922 = local910 * local898 + 16384 >> 15;
											@Pc(930) int local930 = local898 * local914 + 16384 >> 15;
											local884[1] = local922 * local906 + local902 * -local914 + 16384 >> 15;
											local884[6] = local902 * local930 + local910 * -local906 + 16384 >> 15;
											local884[0] = local910 * local902 + local906 * local930 + 16384 >> 15;
											local884[3] = local894 * local914 + 16384 >> 15;
											local884[2] = local894 * local906 + 16384 >> 15;
											local884[7] = -local906 * -local914 + local922 * local902 + 16384 >> 15;
											local884[8] = local902 * local894 + 16384 >> 15;
											local884[4] = local894 * local910 + 16384 >> 15;
											local884[5] = -local898;
											local884[14] = -local835 * local884[8] + -local821 * local884[2] + local884[5] * -local828 + 16384 >> 15;
											local884[12] = local884[6] * -local835 + local884[0] * -local821 + -local828 * local884[3] + 16384 >> 15;
											local884[13] = local884[1] * -local821 + local884[4] * -local828 + local884[7] * -local835 + 16384 >> 15;
										}
										local884[11] = local835;
										local884[9] = local821;
										local884[10] = local828;
									}
									if (local844 != 0 || local853 != 0 || local862 != 0) {
										local735[local743].method4663(local853, local862, local844);
									}
									if (local821 != 0 || local828 != 0 || local835 != 0) {
										local735[local743].translate(local821, local835, local828);
									}
								}
							}
						}
						@Pc(1209) RawModel local1209 = new RawModel(local735, local735.length);
						@Pc(1213) int local1213 = local33 | 0x2000;
						local589 = arg13.method2864(local1209, local1213, Static233.anInt4199, 64, 850);
						for (local821 = 0; local821 < 5; local821++) {
							if (this.colors[local821] < Static353.aShortArrayArray7[local821].length) {
								local589.method3837(Static10.sourceBodyColors[local821], Static353.aShortArrayArray7[local821][this.colors[local821]]);
							}
							if (Static186.aShortArrayArray6[local821].length > this.colors[local821]) {
								local589.method3837(Static43.aShortArray20[local821], Static186.aShortArrayArray6[local821][this.colors[local821]]);
							}
						}
						local589.method3813(local33);
						@Pc(1288) SoftLruHashTable local1288 = Static92.bodyModels;
						synchronized (Static92.bodyModels) {
							Static92.bodyModels.put(checksum, local589);
						}
						this.aLong106 = checksum;
					}
					break;
				}
				local646 = identityKit[local640];
				if ((local646 & 0x40000000) == 0) {
					if ((local646 & Integer.MIN_VALUE) != 0 && !arg3.get(local646 & 0x3FFFFFFF).isBodyModelReady()) {
						local638 = true;
					}
				} else if (!arg12.get(local646 & 0x3FFFFFFF).method4769(this.female)) {
					local638 = true;
				}
				local640++;
			}
		}
		@Pc(1310) Model local1310 = local589.method3799((byte) 4, local33, true);
		if (!local149) {
			return local1310;
		}
		@Pc(1316) int local1316 = 0;
		local640 = 1;
		while (local1316 < local156) {
			if (Static41.aClass2_Sub2_Sub13Array2[local1316] != null) {
				local1310.method3822(Static296.anIntArray381[local1316], Static316.anIntArray396[local1316] - 1, Static385.aClass2_Sub2_Sub13Array4[local1316], local640, Static81.anIntArray219[local1316], Static341.anIntArray429[local1316], Static41.aClass2_Sub2_Sub13Array2[local1316], false, this.anIntArrayArray24 == null ? null : this.anIntArrayArray24[local1316]);
			}
			local1316++;
			local640 <<= 0x1;
		}
		if (local345 != null && local355 != null) {
			local1310.method3810(local195, arg0 - 1, arg4.frameGroup, arg6 - 1, false, local349, local351, local190, local355, local347, local353, local357, local345, local339);
		} else if (local345 != null) {
			local1310.method3827(local195, local347, local190, false, arg0 - 1, local339, local345, 0);
		} else if (local355 != null) {
			local1310.method3827(local353, local357, local351, false, arg6 - 1, local349, local355, 0);
		}
		for (local646 = 0; local646 < local156; local646++) {
			Static41.aClass2_Sub2_Sub13Array2[local646] = null;
			Static385.aClass2_Sub2_Sub13Array4[local646] = null;
			Static114.aClass157Array14[local646] = null;
		}
		return local1310;
	}
}
