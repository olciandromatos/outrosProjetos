package br.com.iead.modelo;

import java.util.Calendar;


public class Pessoa {
	
	// formulario tabela 1
	
	private long codigoDaIgreja;
	private String nomeDaIgreja;
	private String nomeDoMembro;
	private long matriculaDoMembro;
	private char tipoSanguineo;
	private String nomePai;
	private String nomeMae;
	
	// tabela 2
	private String endereco;
	private String bairro;
	private String cidade;
	private long cep;
	private char uf;
	private String email;
	private String telefone;
	private String complemento;
	
	// tabela 3
	private String cpf;
	private String identidade;
	private String orgaoExp;
	private String naturalidade;
	private String nacionalidade;
	private String estadiCivil;
	private String grauInstrucao;
	private Calendar dataNascimento;
	private char sexo;
	
	// tabela 4
	private String classeDaEscolaBiblica;
	private String origemReligiosa;
	private String cargoNaIgrejaAnterior;
	
	// tabela 5
	// sobre a empresa de trabalho
	private String localDeTrabalho;
	private String profissao;
	private String enderecoDoTrabalho;
	private String CidadeOndeTrabalha;
	private char ufDeOndeTrabalha;
	private String cepDeOndeTrabalha;
	private String telefoneDeTrabalho;
	private String complementoDoEnderecoDoTrabalho;
	
	// tabela 6
	//dados complementares historico
	private Calendar dataDoBatismoEmAguas;
	private String local; // cidade
	private Calendar dataBatismoNoEspiritoSanto;
	private Calendar dataDeAdmissaoComoMembro;
	private String motivo; 
	// -() batismo em aguas, ()carta de mudancas, ()aclamacao, ()transferencia interna
	
	// consagracoes
	private String pastor;
	private String presbitero;
	private String evangelista;
	private String auxiliar;
	private String diacono;
	private Calendar dataDeCadastrado;
	
	
	
	

}
