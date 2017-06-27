package se.cbb.jprime.seqevo;

/**
 * Substitution model definition.
 * @author Gustaf Pihl.
 */
public class Blosum62 {

	/**
	 * Returns the model type described by (Henikoff and Henikoff, 1992).
	 * @param cacheSize matrix cache size. Probably not useful with more than twice the number
	 * of arcs in tree...?
	 * @return the model type.
	 */
	public static SubstitutionMatrixHandler createBlosum62(int cacheSize) {
double[] Pi = {
     0.074, 0.052, 0.045, 0.054, 0.025, 0.034, 0.054, 0.074, 0.026, 0.068, 0.099, 0.058, 0.025, 0.047, 0.039, 0.057, 0.051, 0.013, 0.032, 0.073
};

double[] R = {
     0.735790389698, 0.485391055466, 0.543161820899, 1.45999531047, 1.199705704602, 1.1709490428, 1.95588357496, 0.716241444998, 0.605899003687, 0.800016530518, 1.295201266783, 1.253758266664, 0.492964679748, 1.173275900924, 4.325092687057, 1.729178019485, 0.465839367725, 0.718206697586, 2.187774522005, 
     1.297446705134, 0.500964408555, 0.227826574209, 3.020833610064, 1.36057419042, 0.418763308518, 1.456141166336, 0.232036445142, 0.622711669692, 5.411115141489, 0.983692987457, 0.371644693209, 0.448133661718, 1.12278310421, 0.914665954563, 0.426382310122, 0.720517441216, 0.438388343772, 
     3.180100048216, 0.397358949897, 1.839216146992, 1.24048850864, 1.355872344485, 2.414501434208, 0.283017326278, 0.211888159615, 1.593137043457, 0.648441278787, 0.354861249223, 0.494887043702, 2.904101656456, 1.898173634533, 0.191482046247, 0.538222519037, 0.312858797993, 
     0.240836614802, 1.190945703396, 3.761625208368, 0.798473248968, 0.778142664022, 0.418555732462, 0.218131577594, 1.032447924952, 0.222621897958, 0.281730694207, 0.730628272998, 1.582754142065, 0.934187509431, 0.145345046279, 0.261422208965, 0.258129289418, 
     0.32980150463, 0.140748891814, 0.418203192284, 0.354058109831, 0.774894022794, 0.831842640142, 0.285078800906, 0.76768882348, 0.441337471187, 0.356008498769, 1.197188415094, 1.119831358516, 0.527664418872, 0.470237733696, 1.116352478606, 
     5.528919177928, 0.609846305383, 2.43534113114, 0.236202451204, 0.580737093181, 3.945277674515, 2.494896077113, 0.14435695975, 0.858570575674, 1.934870924596, 1.277480294596, 0.758653808642, 0.95898974285, 0.530785790125, 
     0.423579992176, 1.626891056982, 0.186848046932, 0.372625175087, 2.802427151679, 0.55541539747, 0.291409084165, 0.926563934846, 1.769893238937, 1.071097236007, 0.407635648938, 0.596719300346, 0.524253846338, 
     0.539859124954, 0.189296292376, 0.217721159236, 0.752042440303, 0.459436173579, 0.368166464453, 0.504086599527, 1.509326253224, 0.641436011405, 0.508358924638, 0.308055737035, 0.25334079019, 
     0.252718447885, 0.348072209797, 1.022507035889, 0.984311525359, 0.714533703928, 0.527007339151, 1.11702976291, 0.585407090225, 0.30124860078, 4.218953969389, 0.20155597175, 
     3.890963773304, 0.406193586642, 3.364797763104, 1.517359325954, 0.388355409206, 0.35754441246, 1.17909119726, 0.34198578754, 0.674617093228, 8.311839405458, 
     0.445570274261, 6.030559379572, 2.064839703237, 0.374555687471, 0.352969184527, 0.915259857694, 0.6914746346, 0.811245856323, 2.231405688913, 
     1.073061184332, 0.266924750511, 1.047383450722, 1.752165917819, 1.303875200799, 0.332243040634, 0.7179934869, 0.498138475304, 
     1.77385516883, 0.454123625103, 0.918723415746, 1.488548053722, 0.888101098152, 0.951682162246, 2.575850755315, 
     0.233597909629, 0.540027644824, 0.488206118793, 2.074324893497, 6.747260430801, 0.838119610178, 
     1.169129577716, 1.005451683149, 0.252214830027, 0.369405319355, 0.496908410676, 
     5.15155629227, 0.387925622098, 0.796751520761, 0.561925457442, 
     0.513128126891, 0.801010243199, 2.253074051176, 
     4.054419006558, 0.266508731426, 
     1
};

		return new SubstitutionMatrixHandler("Blosum62", SequenceType.AMINO_ACID, R, Pi, cacheSize);
	}

}