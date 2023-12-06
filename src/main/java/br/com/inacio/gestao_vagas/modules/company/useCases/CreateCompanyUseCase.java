package br.com.inacio.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inacio.gestao_vagas.exceptions.UserFoundExcpetion;
import br.com.inacio.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.inacio.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

  @Autowired
  private CompanyRepository companyRepository;

  public CompanyEntity execute(CompanyEntity companyEntity) {

    this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
        .ifPresent((user) -> {
          throw new UserFoundExcpetion();
        });

    return this.companyRepository.save(companyEntity);
  }
}
