/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peppermusic.AutoComboBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author orlando
 */
public class StringSearchable implements Searchable<String,String>{



	private List<String> terms = new ArrayList<String>();

	

	/**

	 * Constructs a new object based upon the parameter terms. 

	 * @param terms The inventory of terms to search.

	 */

	public StringSearchable(List<String> terms){

		this.terms.addAll(terms);

	}

	

	@Override

	public Collection<String> search(String value) {

		List<String> founds = new ArrayList<String>();
                   
		

		for ( String s : terms ){
                    char[] caracteres = value.toCharArray();
                    for (int i = 0; i < value.length()- 2; i++) {
    // Es 'palabra'
    if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
      // Reemplazamos
      caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
    
                    }
                       
			if ( !(s.indexOf(value) != 0 && s.trim().indexOf(value.trim())!=0 && s.trim().indexOf(new String(caracteres).trim())!=0&& s.indexOf(new String(caracteres))!=0&& s.indexOf(value.toUpperCase())!=0 && s.indexOf(Character.toUpperCase(value.charAt(0)) + value.substring(1,value.length()))!=0)){
                                
				founds.add(s);
                                
                        }
			
		}

		return founds;

	}

	

}