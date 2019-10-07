package ejemplo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Ejercicio2 {

	protected Shell shell;
	private Text txtCantidad;
	private Text text;
	private Text txtPrecio;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ejercicio2 window = new Ejercicio2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_4 = new Composite(composite, SWT.NONE);
		composite_4.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		txtCantidad = new Text(composite_4, SWT.CENTER);
		txtCantidad.setEditable(false);
		txtCantidad.setText("Cantidad");
		
		Composite composite_6 = new Composite(composite_4, SWT.NONE);
		
		text = new Text(composite_6, SWT.BORDER);
		text.setText("0");
		text.setBounds(72, 10, 76, 21);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_5 = new Composite(composite_1, SWT.NONE);
		
		txtPrecio = new Text(composite_5, SWT.CENTER);
		txtPrecio.setEditable(false);
		txtPrecio.setText("Precio");
		txtPrecio.setBounds(71, 10, 76, 21);
		
		Composite composite_7 = new Composite(composite_1, SWT.NONE);
		
		text_1 = new Text(composite_7, SWT.BORDER);
		text_1.setText("0");
		text_1.setBounds(71, 10, 76, 21);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		
		Button btnCalcular = new Button(composite_2, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					double precio = Double.parseDouble(text_1.getText());
					double cantidad = Double.parseDouble(text.getText());
					lblNewLabel.setText(String.valueOf(precio*cantidad));
					
				}catch(IllegalArgumentException err) {
					System.out.println("este no es un texto valido");
				}
				
			}
		});
		btnCalcular.setText("Calcular");
		
		
		composite_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		
		lblNewLabel.setText("Precio final");

	}
}
