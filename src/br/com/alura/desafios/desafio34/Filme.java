package br.com.alura.desafios.desafio34;

public class Filme {
    private String titulo;
    private Integer totalVisualizacao;
    private Double avaliacao;
    private Integer anoLancamento;

    public Filme(String titulo, int anoLancamento, int totalVisualizacao, double avaliacao) {
        this.titulo = titulo;
        this.totalVisualizacao = totalVisualizacao;
        this.avaliacao = avaliacao;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(Integer totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", totalVisualizacao=" + totalVisualizacao +
                ", avaliacao=" + avaliacao +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
