package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ayla", 9898);
        agendaContatos.adicionarContato("Marya", 9622);
        agendaContatos.adicionarContato("nivia", 2233);
        agendaContatos.adicionarContato("Luna", 4554);
        agendaContatos.adicionarContato("rachel", 7710);
        agendaContatos.adicionarContato("rachel", 7707);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("nivia");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Marya"));
    }
}
