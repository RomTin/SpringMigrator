package org.ababup1192.sales.after;

import org.ababup1192.common.Environment;
import org.ababup1192.member.before.OldMember;

import java.util.List;

public interface SalesService {
    void truncate();
    void drop();
    void save(Sales sales);
}
