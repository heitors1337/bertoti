public class Main {
    public static void main(String[] args) {
        class Usuario {
            private String nomeUser;
            private String senha;
            private int idUser;
            private int telefone;
            private String email;
            private String endereco;

            public Usuario(String nomeUser, String senha, int idUser, int telefone, String email, String endereco )
                this.nomeUser = nomeUser;
                this.senha = senha;
                this.idUser = idUser;
                this.telefone = telefone;
                this.email = email;
                this.endereco = endereco;

            public int getIdUser() {
                return idUser;
            }

            public int getTelefone() {
                return telefone;
            }

            public String getEmail() {
                return email;
            }

            public String getEndereco() {
                return endereco;
            }

            public String getNomeUser() {
                return nomeUser;
            }

            public String getSenha() {
                return senha;
            }
        }
        class Produto {
            private String nomeProduto;
            private String marca;
            private String tipoProduto;
            private int idProduto;
            private double preco;

            public Produto(String nomeProduto, String marca, String tipoProduto, int idProduto, double preco)
                this.nomeProduto = nomeProduto;
                this.marca = marca;
                this.tipoProduto = tipoProduto;
                this.idProduto = idProduto;
                this.preco = preco;

            public int getIdProduto() {
                return idProduto;
            }

            public double getPreco() {
                return preco;
            }

            public String getNomeProduto() {
                return nomeProduto;
            }

            public String getTipoProduto() {
                return tipoProduto;
            }

            public String getMarca() {
                return marca;
            }
        }
        class Site {

        }
    }
}
