package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> conviadoSet;

    public ConjuntoConvidados() {
        this.conviadoSet = new HashSet<>();
    }

    public void adicionarConviado(String nome, int codigoConvite) {
        conviadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c: conviadoSet) {
            if(c.getCodigoConvidado() == codigoConvite) {
                convidadoParaRemover = c ;
                break;
            }
        }
        conviadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return conviadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(conviadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConviado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConviado("Convidado 2", 1243);
        conjuntoConvidados.adicionarConviado("Convidado 3", 1245);
        conjuntoConvidados.adicionarConviado("Convidado 4", 1254);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvidado(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
