package JhonnyJB.ControlDeStock.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lanas")
public class Lana implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ln_id")
	private int lnId;
	
	@Column(name="ln_marca")
	private String lnMarca;
	
	@Column(name="ln_color")
	private String lnColor;
	
	@Column(name="ln_peso")
	private Double lnPeso;
	
	@Column(name="ln_precio")
	private Double lnPrecio;
	
	@Column(name="ln_envase")
	private char lnEnvase;
	
	@Column(name="ln_descripcion")
	private String lnDescripcion;
	
	public Lana(){
		
	}
	
	public Lana(String lnMarca, String lnColor, Double lnPeso, Double lnPrecio, char lnEnvase, String lnDescripcion) {
		this.lnMarca = lnMarca;
		this.lnColor = lnColor;
		this.lnPeso = lnPeso;
		this.lnPrecio = lnPrecio;
		this.lnEnvase = lnEnvase;
		this.lnDescripcion = lnDescripcion;
	}

	public int getLnId() {
		return lnId;
	}

	public void setLnId(int lnId) {
		this.lnId = lnId;
	}

	public String getLnMarca() {
		return lnMarca;
	}

	public void setLnMarca(String lnMarca) {
		this.lnMarca = lnMarca;
	}

	public String getLnColor() {
		return lnColor;
	}

	public void setLnColor(String lnColor) {
		this.lnColor = lnColor;
	}

	public Double getLnPeso() {
		return lnPeso;
	}

	public void setLnPeso(Double lnPeso) {
		this.lnPeso = lnPeso;
	}

	public char getLnEnvase() {
		return lnEnvase;
	}

	public void setLnEnvase(char lnEnvase) {
		this.lnEnvase = lnEnvase;
	}

	public String getLnDescripcion() {
		return lnDescripcion;
	}

	public void setLnDescripcion(String lnDescripcion) {
		this.lnDescripcion = lnDescripcion;
	}
	
	public Double getLnPrecio() {
		return lnPrecio;
	}

	public void setLnPrecio(Double lnPrecio) {
		this.lnPrecio = lnPrecio;
	}

	@Override
	public String toString() {
		return "Lana [lnId=" + lnId + ", lnMarca=" + lnMarca + ", lnColor=" + lnColor + ", lnPeso=" + lnPeso
				+ ", lnPrecio=" + lnPrecio + ", lnEnvase=" + lnEnvase + ", lnDescripcion=" + lnDescripcion + "]";
	}


	
	
}
