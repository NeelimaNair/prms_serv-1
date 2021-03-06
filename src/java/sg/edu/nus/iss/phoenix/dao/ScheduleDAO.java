/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sg.edu.nus.iss.phoenix.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException;
import sg.edu.nus.iss.phoenix.entity.schedule.ProgramSlot;
import sg.edu.nus.iss.phoenix.entity.schedule.WeeklySchedule;
import sg.edu.nus.iss.phoenix.entity.schedule.AnnualSchedule;

/**
 *
 * @author Karen Athaide
 */
public interface ScheduleDAO {
    /**
     * createValueObject-method. This method is used when the Dao class needs to
     * create new value object instance. The reason why this method exists is
     * that sometimes the programmer may want to extend also the valueObject and
     * then this method can be over-rided to return extended valueObject.
     * @return
     */
    public abstract AnnualSchedule createValueObjectAS();
    
    /**
     * getObject-method. This will create and load valueObject contents from
     * database using given Primary-Key as identifier. This method is just a
     * convenience method for the real load-method which accepts the valueObject
     * as a parameter. Returned valueObject will be created using the
     * createValueObject() method.
     * @param year
     * @return AnnualSchedule
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract AnnualSchedule getObjectAS(String year)
            throws NotFoundException, SQLException;
    
    /**
     * load-method. This will load valueObject contents from database using
     * Primary-Key as identifier. Upper layer should use this so that
     * valueObject instance is created and only primary-key should be specified.
     * Then call this method to complete other persistent information. This
     * method will overwrite all other fields except primary-key and possible
     * runtime variables. If load can not find matching row, NotFoundException
     * will be thrown.
     *
     * @param valueObject
     *            This parameter contains the class instance to be loaded.
     *            Primary-key field must be set for this to work properly.
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract void loadAS(AnnualSchedule valueObject)
            throws NotFoundException, SQLException;
    
    /**
     * LoadAll-method. This will read all contents from database table and build
     * a List containing valueObjects. Please note, that this method will
     * consume huge amounts of resources if table has lot's of rows. This should
     * only be used when target tables have only small amounts of data.
     *
     * @return List<AnnualSchedule>
     * @throws java.sql.SQLException
     */
    public abstract List<AnnualSchedule> loadAllAS() throws SQLException;
    
    /**
     * create-method. This will create new row in database according to supplied
     * valueObject contents. Make sure that values for all NOT NULL columns are
     * correctly specified. Also, if this table does not use automatic
     * surrogate-keys the primary-key must be specified. After INSERT command
     * this method will read the generated primary-key back to valueObject if
     * automatic surrogate-keys were used.
     *
     * @param valueObjectAS
     *            This parameter contains the class instance to be created. If
     *            automatic surrogate-keys are not used the Primary-key field
     *            must be set for this to work properly.
     * @throws java.sql.SQLException
     */
    public abstract void createAS(AnnualSchedule valueObjectAS) throws SQLException;
    
    /**
     * createValueObject-method. This method is used when the Dao class needs to
     * create new value object instance. The reason why this method exists is
     * that sometimes the programmer may want to extend also the valueObject and
     * then this method can be over-rided to return extended valueObject.
     * @return ProgramSlot
     */
    public abstract ProgramSlot createValueObjectPS();
    
    /**
     * getObject-method. This will create and load valueObject contents from
     * database using given Primary-Key as identifier. This method is just a
     * convenience method for the real load-method which accepts the valueObject
     * as a parameter. Returned valueObject will be created using the
     * createValueObject() method.
     * @param programSlotId
     * @return ProgramSlot
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract ProgramSlot getObjectPS(int programSlotId)
            throws NotFoundException, SQLException;
    
    /**
     * load-method. This will load valueObject contents from database using
     * Primary-Key as identifier. Upper layer should use this so that
     * valueObject instance is created and only primary-key should be specified.
     * Then call this method to complete other persistent information. This
     * method will overwrite all other fields except primary-key and possible
     * runtime variables. If load can not find matching row, NotFoundException
     * will be thrown.
     *
     * @param valueObject
     *            This parameter contains the class instance to be loaded.
     *            Primary-key field must be set for this to work properly.
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract void loadPS(ProgramSlot valueObject)
            throws NotFoundException, SQLException;
    
    /**
     * LoadAll-method. This will read all contents from database table and build
     * a List containing valueObjects. Please note, that this method will
     * consume huge amounts of resources if table has lot's of rows. This should
     * only be used when target tables have only small amounts of data.
     *
     * @return List<ProgramSlot>
     * @throws java.sql.SQLException
     */
    public abstract List<ProgramSlot> loadAll() throws SQLException;
    
    /**
     * createValueObject-method. This method is used when the Dao class needs to
     * create new value object instance. The reason why this method exists is
     * that sometimes the programmer may want to extend also the valueObject and
     * then this method can be over-rided to return extended valueObject.
     * @return WeeklySchedule
     */
    public abstract WeeklySchedule createValueObjectWS();
    
    /**
     * getObject-method. This will create and load valueObject contents from
     * database using given Primary-Key as identifier. This method is just a
     * convenience method for the real load-method which accepts the valueObject
     * as a parameter. Returned valueObject will be created using the
     * createValueObject() method.
     * @param year
     * @return WeeklySchedule
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract WeeklySchedule getObjectWS(String year)
            throws NotFoundException, SQLException;
   
    /**
     * LoadAll-method. This will read all contents from database table and build
     * a List containing valueObjects. Please note, that this method will
     * consume huge amounts of resources if table has lot's of rows. This should
     * only be used when target tables have only small amounts of data.
     *
     * @return List<WeeklySchedule>
     * @throws java.sql.SQLException
     */
    public abstract List<WeeklySchedule> loadAllWS(String year) throws SQLException;
    
    /**
     * load-method. This will load valueObject contents from database using
     * Primary-Key as identifier. Upper layer should use this so that
     * valueObject instance is created and only primary-key should be specified.
     * Then call this method to complete other persistent information. This
     * method will overwrite all other fields except primary-key and possible
     * runtime variables. If load can not find matching row, NotFoundException
     * will be thrown.
     *
     * @param valueObjectWS
     *            This parameter contains the class instance to be loaded.
     *            Primary-key field must be set for this to work properly.
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract void loadWS(WeeklySchedule valueObjectWS)
            throws NotFoundException, SQLException;
    
    /**
     * create-method. This will create new row in database according to supplied
     * valueObject contents. Make sure that values for all NOT NULL columns are
     * correctly specified. Also, if this table does not use automatic
     * surrogate-keys the primary-key must be specified. After INSERT command
     * this method will read the generated primary-key back to valueObject if
     * automatic surrogate-keys were used.
     *
     * @param valueObjectWS
     *            This parameter contains the class instance to be created. If
     *            automatic surrogate-keys are not used the Primary-key field
     *            must be set for this to work properly.
     * @throws java.sql.SQLException
     */
    public abstract void createWS(WeeklySchedule valueObjectWS) throws SQLException;
    
    /**
     * create-method. This will create new row in database according to supplied
     * valueObject contents. Make sure that values for all NOT NULL columns are
     * correctly specified. Also, if this table does not use automatic
     * surrogate-keys the primary-key must be specified. After INSERT command
     * this method will read the generated primary-key back to valueObject if
     * automatic surrogate-keys were used.
     *
     * @param valueObject
     *            This parameter contains the class instance to be created. If
     *            automatic surrogate-keys are not used the Primary-key field
     *            must be set for this to work properly.
     * @throws java.sql.SQLException
     */
    public abstract void createPS(ProgramSlot valueObject) throws SQLException;
    
    /**
     * save-method. This method will save the current state of valueObject to
     * database. Save can not be used to create new instances in database, so
     * upper layer must make sure that the primary-key is correctly specified.
     * Primary-key will indicate which instance is going to be updated in
     * database. If save can not find matching row, NotFoundException will be
     * thrown.
     *
     * @param valueObject
     *            This parameter contains the class instance to be saved.
     *            Primary-key field must be set for this to work properly.
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract void save(ProgramSlot valueObject)
            throws NotFoundException, SQLException;
    
    /**
     * delete-method. This method will remove the information from database as
     * identified by by primary-key in supplied valueObject. Once valueObject
     * has been deleted it can not be restored by calling save. Restoring can
     * only be done using create method but if database is using automatic
     * surrogate-keys, the resulting object will have different primary-key than
     * what it was in the deleted object. If delete can not find matching row,
     * NotFoundException will be thrown.
     *
     * @param valueObject
     *            This parameter contains the class instance to be deleted.
     *            Primary-key field must be set for this to work properly.
     * @throws sg.edu.nus.iss.phoenix.core.exceptions.NotFoundException
     * @throws java.sql.SQLException
     */
    public abstract void delete(ProgramSlot valueObject)
            throws NotFoundException, SQLException;
    
    /**
     * deleteAll-method. This method will remove all information from the table
     * that matches this Dao and ValueObject couple. This should be the most
     * efficient way to clear table. Once deleteAll has been called, no
     * valueObject that has been created before can be restored by calling save.
     * Restoring can only be done using create method but if database is using
     * automatic surrogate-keys, the resulting object will have different
     * primary-key than what it was in the deleted object. (Note, the
     * implementation of this method should be different with different DB
     * backends.)
     *
     * @param conn
     *            This method requires working database connection.
     * @throws java.sql.SQLException
     */
    public abstract void deleteAll(Connection conn) throws SQLException;
    
    /**
     * coutAll-method. This method will return the number of all rows from table
     * that matches this Dao. The implementation will simply execute
     * "select count(primarykey) from table". If table is empty, the return
     * value is 0. This method should be used before calling loadAll, to make
     * sure table has not too many rows.
     *
     * @return integer
     * @throws java.sql.SQLException
     */
    public abstract int countAll() throws SQLException;
    
    /**
     * searchMatching-Method. This method provides searching capability to get
     * matching valueObjects from database. It works by searching all objects
     * that match permanent instance variables of given object. Upper layer
     * should use this by setting some parameters in valueObject and then call
     * searchMatching. The result will be 0-N objects in a List, all matching
     * those criteria you specified. Those instance-variables that have NULL
     * values are excluded in search-criteria.
     *
     * @param valueObject
     *            This parameter contains the class instance where search will
     *            be based. Primary-key field should not be set.
     * @return List<ProgramSlot>
     * @throws java.sql.SQLException
     */
    public abstract List<ProgramSlot> searchMatching(ProgramSlot valueObject)
            throws SQLException;
    
    /**
     * searchMatchingWS-Method. This method provides searching capability to get
     * matching valueObjects from database. It works by searching all objects
     * that match permanent instance variables of given object. Upper layer
     * should use this by setting some parameters in valueObject and then call
     * searchMatching. The result will be 0-N objects in a List, all matching
     * those criteria you specified. Those instance-variables that have NULL
     * values are excluded in search-criteria.
     *
     * @param valueObject
     *            This parameter contains the class instance where search will
     *            be based. Primary-key field should not be set.
     * @return List<WeeklySchedule>
     * @throws java.sql.SQLException
     */
    public abstract List<WeeklySchedule> searchMatchingWS(WeeklySchedule valueObject)
            throws SQLException;
    
    /**
     * searchMatchingAS-Method. This method provides searching capability to get
     * matching valueObjects from database. It works by searching all objects
     * that match permanent instance variables of given object. Upper layer
     * should use this by setting some parameters in valueObject and then call
     * searchMatching. The result will be 0-N objects in a List, all matching
     * those criteria you specified. Those instance-variables that have NULL
     * values are excluded in search-criteria.
     *
     * @param valueObject
     *            This parameter contains the class instance where search will
     *            be based. Primary-key field should not be set.
     * @return List<AnnualSchedule>
     * @throws java.sql.SQLException
     */
    public abstract List<AnnualSchedule> searchMatchingAS(AnnualSchedule valueObject)
            throws SQLException;
    
}
