/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_6.WilliamsComposerApp;

import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    public MemComposerDao() {
        // Initialize with a default list of composer objects
    }

    @Override
    public List<Composer> findAll() {
        // Return a list of composer objects
        return composers;
    }

    @Override
    public Composer findBy(Integer id) {
        // Return a single composer object matching the id
        return null;
    }

    @Override
    public void insert(Composer composer) {
        // Add a new composer object to the list of composers
    }
}
