package Login.BackEnd.service;

import Login.BackEnd.exception.UserNotFoundException;
import Login.BackEnd.model.Educacion;
import Login.BackEnd.model.Usuario;
import Login.BackEnd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario addUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarUsuario(){
        return usuarioRepository.findAll();
    }
    public Usuario editarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void borrarUsuario (Long id){
        usuarioRepository.deleteById(id);
    }

    public  Usuario buscarUsuarioPorId (Long id){
        return usuarioRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
    }
}


