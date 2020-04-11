package ZCW.steamNews.repositories;

import ZCW.steamNews.modules.News;
import org.springframework.data.repository.CrudRepository;

public interface SteamNewsRepository extends CrudRepository<News, Long> {
}
