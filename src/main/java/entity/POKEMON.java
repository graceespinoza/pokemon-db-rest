package entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class POKEMON implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="name", length=50)
	private String name;
	
	private char status;
	
	@ManyToOne
	@JoinColumn(name="cate")
	private Poke_Categorias cate;
	
	
	 public Long getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(Long codigo) {
	        this.codigo = codigo;
	    }
	 
	  
//	 
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

		
	
		  public char getStatus() {
			    return status;
			  }

		  public void setStatus(char status) {
		        this.status = status;
		    }
	

}
