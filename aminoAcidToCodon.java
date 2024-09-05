import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aminoAcidToCodon {

    public static void main(String[] args) {
        // Map of amino acids to their codons
        Map<String, String[]> aminoAcidMap = new HashMap<>();
        aminoAcidMap.put("Phenylalanine", new String[]{"UUU", "UUC"});
        aminoAcidMap.put("Leucine", new String[]{"UUA", "UUG", "CUU", "CUC", "CUA", "CUG"});
        aminoAcidMap.put("Isoleucine", new String[]{"AUU", "AUC", "AUA"});
        aminoAcidMap.put("Methionine", new String[]{"AUG"});  // Start codon
        aminoAcidMap.put("Valine", new String[]{"GUU", "GUC", "GUA", "GUG"});
        aminoAcidMap.put("Serine", new String[]{"UCU", "UCC", "UCA", "UCG", "AGU", "AGC"});
        aminoAcidMap.put("Proline", new String[]{"CCU", "CCC", "CCA", "CCG"});
        aminoAcidMap.put("Threonine", new String[]{"ACU", "ACC", "ACA", "ACG"});
        aminoAcidMap.put("Alanine", new String[]{"GCU", "GCC", "GCA", "GCG"});
        aminoAcidMap.put("Tyrosine", new String[]{"UAU", "UAC"});
        aminoAcidMap.put("STOP", new String[]{"UAA", "UAG", "UGA"});
        aminoAcidMap.put("Histidine", new String[]{"CAU", "CAC"});
        aminoAcidMap.put("Glutamine", new String[]{"CAA", "CAG"});
        aminoAcidMap.put("Asparagine", new String[]{"AAU", "AAC"});
        aminoAcidMap.put("Lysine", new String[]{"AAA", "AAG"});
        aminoAcidMap.put("Aspartic acid", new String[]{"GAU", "GAC"});
        aminoAcidMap.put("Glutamic acid", new String[]{"GAA", "GAG"});
        aminoAcidMap.put("Cysteine", new String[]{"UGU", "UGC"});
        aminoAcidMap.put("Tryptophan", new String[]{"UGG"});
        aminoAcidMap.put("Arginine", new String[]{"CGU", "CGC", "CGA", "CGG", "AGA", "AGG"});
        aminoAcidMap.put("Glycine", new String[]{"GGU", "GGC", "GGA", "GGG"});

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amino acid name (e.g., Leucine): ");
        String aminoAcid = scanner.nextLine().trim().toLowerCase();

        // Capitalize the first letter of the amino acid for consistency with the map
        aminoAcid = aminoAcid.substring(0, 1).toUpperCase() + aminoAcid.substring(1);

        // Validate and display codons
        if (!aminoAcidMap.containsKey(aminoAcid)) {
            System.out.println("Invalid amino acid name.");
        } else {
            String[] codons = aminoAcidMap.get(aminoAcid);
            System.out.println("Codons for " + aminoAcid + ":");
            for (String codon : codons) {
                System.out.println(codon);
            }
        }

        scanner.close();
    }
}
