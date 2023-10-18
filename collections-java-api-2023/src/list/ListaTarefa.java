package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaLista;

    public ListaTarefa () {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaLista) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaLista.size();
    }

    public void obterDescricoesTotalTarefas() {
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTotalTarefas();
    }
}
