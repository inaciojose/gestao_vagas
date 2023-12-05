package br.com.inacio.gestao_vagas.exceptions;

public class UserFoundExcpetion extends RuntimeException {
  public UserFoundExcpetion(){
    super("Usuário já existe");
  }
}
