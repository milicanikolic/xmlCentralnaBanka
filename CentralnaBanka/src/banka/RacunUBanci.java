package banka;

import java.io.Serializable;
import java.math.BigDecimal;

public class RacunUBanci implements Serializable{

	
	private BigDecimal raspolozivoStanje;
	private BigDecimal rezervisanoStanje;
	
	public RacunUBanci(){
		raspolozivoStanje=new BigDecimal(0);
		rezervisanoStanje=new BigDecimal(0);
		
	}

	public BigDecimal getRaspolozivoStanje() {
		return raspolozivoStanje;
	}

	public void setRaspolozivoStanje(BigDecimal raspolozivoStanje) {
		this.raspolozivoStanje = raspolozivoStanje;
	}

	public BigDecimal getUkupnoStanje() {
		return raspolozivoStanje.add(rezervisanoStanje);
	}

	public BigDecimal getRezervisanoStanje() {
		return rezervisanoStanje;
	}

	public void setRezervisanoStanje(BigDecimal rezervisanoStanje) {
		this.rezervisanoStanje = rezervisanoStanje;
	}


	
	
	
}
