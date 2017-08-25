package se.cbb.jprime.seqevo;

/**
 * Substitution model definition.
 * @author Gustaf Pihl.
 */
public class Cprev {

	/**
	 * Returns the model type described by (Adachi et al., 2000).
	 * @param cacheSize matrix cache size. Probably not useful with more than twice the number
	 * of arcs in tree...?
	 * @return the model type.
	 */
	public static SubstitutionMatrixHandler createCprev(int cacheSize) {
		double[] Pi = {
		     0.0755, 0.0621, 0.0410, 0.0371, 0.0091, 0.0382, 0.0495, 0.0838, 0.0246, 0.0806, 0.1011, 0.0504, 0.0220, 0.0506, 0.0431, 0.0622, 0.0543, 0.0181, 0.0307, 0.0660
		};
		
		double[] R = {
		     105, 227, 175, 669, 157, 499, 665, 66, 145, 197, 236, 185, 68, 490, 2440, 1340, 14, 56, 968, 
		     357, 43, 823, 1745, 152, 243, 715, 136, 203, 4482, 125, 53, 87, 385, 314, 230, 323, 92, 
		     4435, 538, 768, 1055, 653, 1405, 168, 113, 2430, 61, 97, 173, 2085, 1393, 40, 754, 83, 
		     10, 400, 3691, 431, 331, 10, 10, 412, 47, 22, 170, 590, 266, 18, 281, 75, 
		     10, 10, 303, 441, 280, 396, 48, 159, 726, 285, 2331, 576, 435, 1466, 592, 
		     3122, 133, 1269, 92, 286, 3313, 202, 10, 323, 396, 241, 53, 391, 54, 
		     379, 162, 148, 82, 2629, 113, 145, 185, 568, 369, 63, 142, 200, 
		     19, 40, 20, 263, 21, 25, 28, 691, 92, 82, 10, 91, 
		     29, 66, 305, 10, 127, 152, 303, 32, 69, 1971, 25, 
		     1745, 345, 1772, 454, 117, 216, 1040, 42, 89, 4797, 
		     218, 1351, 1268, 219, 516, 156, 159, 189, 865, 
		     193, 72, 302, 868, 918, 10, 247, 249, 
		     327, 100, 93, 645, 86, 215, 475, 
		     43, 487, 148, 468, 2370, 317, 
		     1202, 260, 49, 97, 122, 
		     2151, 73, 522, 167, 
		     29, 71, 760, 
		     346, 10, 
		     119
		};

		return new SubstitutionMatrixHandler("Cprev", SequenceType.AMINO_ACID, R, Pi, cacheSize);
	}

}