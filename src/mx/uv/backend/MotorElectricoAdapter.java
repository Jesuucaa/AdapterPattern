package mx.uv.backend;

// Se crea una clase que extienda de motor para que se adapte con la otra clase MotorElectrico
public class MotorElectricoAdapter extends Motor {
	private MotorElectrico motorElectrico;
	
	// En esta clase se da un cuerpo a los metodos abstractos de la clase
	// abstracta Motor haciendo uso de una referencia de la clase que se 
	// va a adaptar (MotorElectrico) -> private MotorElectrico motorElectrico;

	public MotorElectricoAdapter()
	{
		super();
		System.out.println("Creando motor eléctrico adapter...");
		this.motorElectrico = new MotorElectrico();
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo motor eléctrico adapter");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor eléctrico adapter");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor eléctrico adapter");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}

}
