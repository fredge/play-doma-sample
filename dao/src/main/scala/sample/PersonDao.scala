package sample

import org.seasar.doma._
import org.seasar.doma.jdbc.Result

import domala.ScalaDomaConfig

@Dao(config = classOf[ScalaDomaConfig])
trait PersonDao {

    @Select
    def selectById(@ParameterName("id") id:Int): java.util.Optional[Person]

    @Select
    def selectAll(): java.util.List[Person]

    @Insert
    def insert(person: Person): Result[Person]

    @Update
    def update(person: Person): Result[Person]

    @Delete
    def delete(person: Person): Result[Person]
}