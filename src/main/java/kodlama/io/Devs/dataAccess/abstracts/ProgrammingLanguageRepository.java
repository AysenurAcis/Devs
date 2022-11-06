package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}