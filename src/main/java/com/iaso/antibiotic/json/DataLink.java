/******************************
 * User: yuan
 * Date: 17-10-11 上午9:11
 * Email: kq_yuan@outlook.com
 *
 * Description:
 *
 ******************************/
package com.iaso.antibiotic.json;

import javax.management.relation.Relation;

public class DataLink extends DataStatus{
    public DataLink(int code, String msg) {
        super(code, msg);
    }

    public DataLink(int code, String msg, String relationType) {
        super(code, msg);
        this.relation = new RelationShip(relationType);
    }

    public DataLink(int code, String msg, String id, String head, String tail, String relationTyp) {
        super(code, msg);
        this.relation = new RelationShip(id, head, tail, relationTyp);
    }



    /*private String relationType;

    public DataLink(int code, String msg, String relationType) {
        super(code, msg);
        this.relationType = relationType;
    }

    public String getRelationType() {
        return relationType;
    }*/

    private RelationShip relation;

    public RelationShip getRelation() {
        return relation;
    }

    public void setRelation(String head, String tail, String id, String relationType) {
        this.relation = new RelationShip(head, tail, id, relationType);
    }

    class RelationShip {
        private String id;
        private String head;
        private String tail;
        private String relationType;

        public String getId() {
            return id;
        }

        public String getHead() {
            return head;
        }

        public String getTail() {
            return tail;
        }

        public String getRelationType() {
            return relationType;
        }

        public RelationShip(String relationType) {
            this.relationType = relationType;
        }

        public RelationShip(String id, String head, String tail, String relationType) {
            this.id = id;
            this.head = head;
            this.tail = tail;
            this.relationType = relationType;
        }
    }
}


