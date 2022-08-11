package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "boxes") // en caso que la tabla sea diferente
public class Box {
	
	// Atributos de entidad boxes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "numreference") // no hace falta si se llama igual
		private String numReference;
		@Column(name = "contents") // no hace falta si se llama igual
		private String contents;
		@Column(name = "value") // no hace falta si se llama igual
		private int value;
		
		@ManyToOne
		@JoinColumn(name = "warehouses_id")
		private Warehouse warehouse;
		

		// Constructores
		
		public Box() {

		}

		/**
		 * 
		 * @param id
		 * @param numReference
		 * @param contents
		 * @param warehouse
		 * @param value 
		 */
		public Box(Long id, String numReference, String contents, Warehouse warehouse, int value) {
			super();
			this.id = id;
			this.numReference = numReference;
			this.contents = contents;
			this.value =value;
			this.warehouse = warehouse;
		}

		// getter y setter
		/**
		 * 
		 * @return
		 */
		public Long getId() {
			return id;
		}
		/**
		 * 
		 * @param id
		 */
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * 
		 * @return
		 */
		public String getNumReference() {
			return numReference;
		}
		
		/**
		 * 
		 * @param numReference
		 */
		public void setNumReference(String numReference) {
			this.numReference = numReference;
		}
		
		/**
		 * 
		 * @return
		 */
		public String getContents() {
			return contents;
		}
		/**
		 * 
		 * @param contents
		 */
		public void setContents(String contents) {
			this.contents = contents;
		}
		
		
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * 
		 * @return
		 */
		public Warehouse getWarehouse() {
			return warehouse;
		}
		/**
		 * 
		 * @param warehouse
		 */
		public void setWarehouse(Warehouse warehouse) {
			this.warehouse = warehouse;
		}

		@Override
		public String toString() {
			return "Box [id=" + id + ", numReference=" + numReference + ", contents=" + contents + ", value=" + value
					+ ", warehouse=" + warehouse + "]";
		}
		
		
}
