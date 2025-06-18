package trabalhoFinal;

public class Usuario {
	private String login;
	private int senha;
	private String tipoUsuario;
	
	public Usuario(String login, int senha, String tipoUsuario) {
		this.login = login;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	@Override
	public String toString() {
		return "Usuario login=" + login + ", senha=" + senha + ", tipoUsuario=" + tipoUsuario;
	}
}


