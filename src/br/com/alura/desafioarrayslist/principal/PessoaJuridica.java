package br.com.alura.desafioarrayslist.principal;

public class PessoaJuridica extends PrincipalPessoa{

    private String cnpj;
    private String nomeRazaoSocial;

   public PessoaJuridica(String cnpj, String nomeRazaoSocial) {
       this.cnpj = cnpj;
       this.nomeRazaoSocial = nomeRazaoSocial;
   }
    public String getCnpj() {
        return cnpj;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + this.getNomeRazaoSocial() + " Cnpj: " + this.getCnpj();
    }
}
