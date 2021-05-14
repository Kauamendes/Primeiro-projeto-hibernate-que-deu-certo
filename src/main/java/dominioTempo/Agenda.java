package dominioTempo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agenda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column
	private String nome;
	@Column
	private String telefone;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataregistro;
	
	public Agenda() {}

	public Agenda(String nome, String telefone, Date dataregistro) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataregistro = dataregistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataregistro() {
		return dataregistro;
	}

	public void setDataregistro(Date dataregistro) {
		this.dataregistro = dataregistro;
	}

	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", telefone=" + telefone + ", dataregistro=" + dataregistro + "]";
	}
	
	
}
