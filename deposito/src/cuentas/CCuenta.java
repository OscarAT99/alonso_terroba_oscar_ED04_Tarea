package cuentas;

/**
 * Ejercicio de hacer cuentas
 * 
 * @author Oscar
 * @version 1.0
 *
 */
public class CCuenta {

	/**
	 * Nombre de la cuenta
	 */
	protected String nombre;
	
	/**
	 * Codigo de la cuenta
	 */
    protected String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    protected double saldo;
    
    /**
     * Tipo de interés de la cuenta
     */
    protected double tipoInteres;

    /**
     * Constructor de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta
     * @param nom Nombre de la cuenta
     * @param cue Codigo de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Retorna el estado de la cuenta
     * @return EL estado de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Inserta una cantidad a la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Error Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si falta saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	/**
	 * Obtener el nombre de la cuenta
	 * @return Nombre de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guardar el nombre de cuenta
	 * @param nombre El nombre de la cuenta a guardar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el código de cuenta
	 * @return Devuelve el código de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Guarda el código de cuenta
	 * @param cuenta El código de cuenta a guardar
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo en cuenta
	 * @return El saldo en cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Guarda el saldo
	 * @param saldo El saldo a guardar
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interés
	 * @return El tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Guarda el interés
	 * @param tipoInteres El tipo de interés a guardar
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
