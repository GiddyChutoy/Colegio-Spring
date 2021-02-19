/**
 * 
 */
package com.adri.colegio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adri.colegio.dtos.Caja;
import com.adri.colegio.entities.CajaEntities;

/**
 * @author 201907
 *
 */
public interface CajaRepository extends CrudRepository<CajaEntities, Integer> {

	@Query(value = "select new com.adri.colegio.dtos.Caja (c.id, m.id, c.importe)"
			+ " FROM com.adri.colegio.entities.CajaEntities as c"
			+ "	INNER JOIN com.adri.colegio.entities.MatriculaEntities as m on c.idMatricula.id = m.id"
			+ " WHERE (m.id LIKE CONCAT('%', :idMatricula, '%') or :idMatricula is null)")
	List<Caja> listaCajas(@Param("idMatricula") Integer idMatricula);
	
}
