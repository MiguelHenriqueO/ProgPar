public abstract class Usuario implements Login{
    private int id;
    private String username;
    private String password;
    private String nome;
    private String tipo;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, String nome, String tipo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean login(String username, String password) {
        if(this.username.equals(username)){
            if(this.password.equals(password)){
                return true;
            }
            System.out.println("Senha incorreta");
            return false;
        }
        System.out.println("Usuário desconhecido");
        return false;
    }

    public void registroPedido(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void logout(){
        System.out.println("Até mais!");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
