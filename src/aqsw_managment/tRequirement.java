/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aqsw_managment;

/**
 *
 * @author p075446
 */
public class tRequirement {
        private String _requirement_Id;
	private String _requirement_Title;
	private String _requirement_Version_Type;
	private String _requirement_Type;
	//private String _requirement_Description;
	//private String _requirement_Purpose;
	//private String _requirement_Risk;
	private String _requirement_Domaine;
	private String _requirement_ASIL_Level;
	private String _requirement_SCM_Status;
	//private String _requirement_iSCM_Status;
	//private String _requirement_SCS_Status;
	//private String _requirement_iSCS_Status;
	private String _requirement_Responsible;
	//private String _requirement_Status;
        private String _fk_requirement_outcome_id;
    
        
        tRequirement(String req_id, String req_title, String req_ver_type, String req_type, String req_dom, String req_asil, String req_scm_st, String req_resp, String fk_req_outc)
        {
            
            this._requirement_Id = req_id;
            this._requirement_Title = req_title;
            this._requirement_Version_Type = req_ver_type;
            this._requirement_Type = req_type;
            this._requirement_Domaine = req_dom;
            this._requirement_ASIL_Level = req_asil;
            this._requirement_SCM_Status = req_scm_st;
            this._requirement_Responsible = req_resp;
            this._fk_requirement_outcome_id = fk_req_outc;
        }
        
        public String get_requirement_Id()
        {
            return _requirement_Id;
        }
        public String get_requirement_Title()
        {
            return _requirement_Title;
        }
        public String get_requirement_Version_Type()
                        {
            return _requirement_Version_Type;
        }

        public String get_requirement_Type()
                        {
            return _requirement_Type;
        }

        public String get_requirement_Domaine()
                        {
            return _requirement_Domaine;
        }

        public String get_requirement_ASIL_Level()
                        {
            return _requirement_ASIL_Level;
        }

        public String get_requirement_SCM_Status()
                        {
            return _requirement_SCM_Status;
        }

        public String get_requirement_Responsible()
                        {
            return _requirement_Responsible;
        }
        
        public String get_fk_requirement_outcome_id()
        {
            return _fk_requirement_outcome_id;
        }

}
