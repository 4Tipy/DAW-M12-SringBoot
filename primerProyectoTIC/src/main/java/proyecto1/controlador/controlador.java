package proyecto1.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import proyecto1.bean.Libro;
import proyecto1.bean.Usuario;
import proyecto1.repository.BaseDatos;
import proyecto1.repository.BaseDatos2;
import proyecto1.repository.BaseDatos3;

import org.springframework.ui.Model; 

@Controller
@RequestMapping("")
public class controlador {
	
//	Usuario usuario;
//	BaseDatos2 bd = new BaseDatos2();
	
	@Autowired
	BaseDatos3 bd;
private Object usuario;
	
	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo", "Formulario de Acceso");
		return "login";
	}
	
	
	
	@PostMapping("/")
	public String login(Usuario usuario, Model model) {
		if (usuario.getNombre().equals("leo") && usuario.getPassword().equals("123")) {
			ArrayList<Libro> libros = (ArrayList<Libro>)bd.findAll();
			model.addAttribute("usuario", usuario);
			this.usuario = usuario;
			model.addAttribute("libros", libros);
			return "consulta";
		} else 
			return "login";
	}
	
	@PostMapping("/insertar")
	public String insertar (Libro libro, Model model) {
//		bd.inserta(libro);
		bd.save(libro);
		ArrayList<Libro> libros = (ArrayList<Libro>)bd.findAll();
		model.addAttribute("usuario", this.usuario);
		model.addAttribute("libros", libros);
		model.addAttribute("boton", "Insertar Libro");
		model.addAttribute("action", "/insertar");
		model.addAttribute("libro", null);
		return "consulta";
	}
	
//	@GetMapping("/borrado/{id}")
//	public String borrar(@PathVariable int id, Model model) {
//		bd.borrar(id);
//		ArrayList<Libro> libros = bd.getLibros();
//		model.addAttribute("libros", libros);
//		model.addAttribute("usuario", this.usuario);
//		model.addAttribute("boton", "Insertar Libro");
//		model.addAttribute("action", "/insertar");
//		return "consulta";
//	}
//	
//	@GetMapping("/modificar/{id}")
//	public String modificar(@PathVariable int id, Model model) {
//	    Libro libro = bd.getLibro(id); // Utiliza el nuevo método getLibro
//	    ArrayList<Libro> libros = bd.getLibros();
//	    model.addAttribute("libros", libros);
//	    model.addAttribute("libro", libro);
//	    model.addAttribute("usuario", this.usuario);
//	    model.addAttribute("boton", "Actualiza libro");
//	    model.addAttribute("action", "/modificar");
//	    return "consulta";
//	}
//
//	
//	@PostMapping("/modificar")
//	public String modificar2(Libro libro, Model model) {
//		bd.modifica(libro);
//		ArrayList<Libro> libros = bd.getLibros();
//		model.addAttribute("usuario", this.usuario);
//		model.addAttribute("libros", libros);
//		model.addAttribute("libro", null);
//		model.addAttribute("boton", "Insertar libro");
//		model.addAttribute("action", "/insertar");
//		return "consulta";
//	}
	
	
	
//	public String login(Model model,
//			@RequestParam String nombre,
//			@RequestParam String password) {
//		if (nombre.equals("leo") && password.equals("123"))
//			return "consulta";
//		else
//			return "login";	
//	}
	
	
		
	
}
