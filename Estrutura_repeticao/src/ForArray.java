public class ForArray {
    public static void main(String[] args) throws Exception {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	/* for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}
     */


    //Forma abreviada
	for(String aluno : alunos) {
        System.out.println("O nome do aluno é: "+aluno);
      }

    }
}
