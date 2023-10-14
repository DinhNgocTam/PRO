/*
@author Hi
@date Oct 14, 2023
*/
package repository;

import java.util.HashMap;

import dataAccess.DictonaryDao;
import model.English;
import model.Vietnamese;

public class DictionaryRepository implements IDictionary{
	HashMap<English, Vietnamese> hm = new HashMap<>();
	@Override
	public void addWord() {
		DictonaryDao.Instance().addNewWord(hm);
		
	}

	@Override
	public void removeWord() {
		DictonaryDao.Instance().deleteWord(hm);
		
	}

	@Override
	public void translate() {
		DictonaryDao.Instance().translate(hm);
		
	}

}
