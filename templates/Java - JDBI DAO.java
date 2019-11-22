package ${PACKAGE_NAME};

import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;
import org.skife.jdbi.v2.unstable.BindIn;

@UseStringTemplate3StatementLocator
public interface ${NAME}Dao {
    static ${NAME}Dao getInstance() { return JdbiFactory.getDataSource("${Datasource_name}").onDemand(${NAME}Dao.class); }
}