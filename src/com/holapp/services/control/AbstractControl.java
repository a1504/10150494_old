package com.holapp.services.control;

import com.holapp.gcs.CanalGCS;
import com.holapp.gcs.UsuarioGCS;

abstract class AbstractControl {
	
	protected boolean userHasActivateAccount(String userName) {
		UsuarioGCS usuarioGCS = new UsuarioGCS();
		return usuarioGCS.accountIsActivate(userName);
	}

}
