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
public class tEvidence {
        private String _evidence_Id;
	private String _evidence_Title;
	//private String _evidence_Description;
	private String _evidence_Status;
        
        
	tEvidence(String evid_id, String evid_title, String evid_st)
        {
            this._evidence_Id = evid_id;
            this._evidence_Title = evid_title;
            this._evidence_Status = evid_st;             
        }
    
        public String get_evidence_Id ()
        {
            return _evidence_Id;
        }
        
        public String get_evidence_Title ()
        {
            return _evidence_Title;
        }
        
        public String get_evidence_Status ()
        {
            return _evidence_Status;
        }
}
