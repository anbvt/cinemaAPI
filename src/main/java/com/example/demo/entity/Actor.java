package com.example.demo.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 * Actor of Movie
 * 
 */
@Entity
@Data
@Table
@NoArgsConstructor
public class Actor {
	/*
	 *	Id of actor 
	 */
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "actor_id_seq")
    @Column
    private Integer id;
	/*
	 *	Name of actor 
	 */
    @Column
    private String name;


}
