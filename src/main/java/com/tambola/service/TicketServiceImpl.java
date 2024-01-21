package com.tambola.service;

import com.tambola.dto.PageableResponse;
import com.tambola.entity.Ticket;
import com.tambola.repositories.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;
    private Logger logger = LoggerFactory.getLogger(TicketServiceImpl.class);

    static Integer[] shuffle(Integer[] arr) {
        List<Integer> intList = Arrays.asList(arr);

        Collections.shuffle(intList);
        Integer[] s = intList.toArray(arr);
//        System.out.println(Arrays.toString(s));
        return s;
    }


    @Override
    public void create(int n) {

        try { int setNo=1;

            while ((n > 0)) {


                Integer[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Integer[] a2 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
            Integer[] a3 = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
            Integer[] a4 = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39};
            Integer[] a5 = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
            Integer[] a6 = {50, 51, 52, 53, 54, 55, 56, 57, 58, 59};
            Integer[] a7 = {60, 61, 62, 63, 64, 65, 66, 67, 68, 69};
            Integer[] a8 = {70, 71, 72, 73, 74, 75, 76, 77, 78, 79};
            Integer[] a9 = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

            shuffle(a1);
            shuffle(a2);
            shuffle(a3);
            shuffle(a4);
            shuffle(a5);
            shuffle(a6);
            shuffle(a7);
            shuffle(a8);
            shuffle(a9);

            ArrayList<Integer> c11 = new ArrayList<Integer>();
            ArrayList<Integer> c12 = new ArrayList<Integer>();
            ArrayList<Integer> c13 = new ArrayList<Integer>();
            ArrayList<Integer> c14 = new ArrayList<Integer>();
            ArrayList<Integer> c15 = new ArrayList<Integer>();
            ArrayList<Integer> c16 = new ArrayList<Integer>();
            ArrayList<Integer> c17 = new ArrayList<Integer>();
            ArrayList<Integer> c18 = new ArrayList<Integer>();
            ArrayList<Integer> c19 = new ArrayList<Integer>();
            ArrayList<Integer> c21 = new ArrayList<Integer>();
            ArrayList<Integer> c22 = new ArrayList<Integer>();
            ArrayList<Integer> c23 = new ArrayList<Integer>();
            ArrayList<Integer> c24 = new ArrayList<Integer>();
            ArrayList<Integer> c25 = new ArrayList<Integer>();
            ArrayList<Integer> c26 = new ArrayList<Integer>();
            ArrayList<Integer> c27 = new ArrayList<Integer>();
            ArrayList<Integer> c28 = new ArrayList<Integer>();
            ArrayList<Integer> c29 = new ArrayList<Integer>();
            ArrayList<Integer> c31 = new ArrayList<Integer>();
            ArrayList<Integer> c32 = new ArrayList<Integer>();
            ArrayList<Integer> c33 = new ArrayList<Integer>();
            ArrayList<Integer> c34 = new ArrayList<Integer>();
            ArrayList<Integer> c35 = new ArrayList<Integer>();
            ArrayList<Integer> c36 = new ArrayList<Integer>();
            ArrayList<Integer> c37 = new ArrayList<Integer>();
            ArrayList<Integer> c38 = new ArrayList<Integer>();
            ArrayList<Integer> c39 = new ArrayList<Integer>();
            ArrayList<Integer> c41 = new ArrayList<Integer>();
            ArrayList<Integer> c42 = new ArrayList<Integer>();
            ArrayList<Integer> c43 = new ArrayList<Integer>();
            ArrayList<Integer> c44 = new ArrayList<Integer>();
            ArrayList<Integer> c45 = new ArrayList<Integer>();
            ArrayList<Integer> c46 = new ArrayList<Integer>();
            ArrayList<Integer> c47 = new ArrayList<Integer>();
            ArrayList<Integer> c48 = new ArrayList<Integer>();
            ArrayList<Integer> c49 = new ArrayList<Integer>();
            ArrayList<Integer> c51 = new ArrayList<Integer>();
            ArrayList<Integer> c52 = new ArrayList<Integer>();
            ArrayList<Integer> c53 = new ArrayList<Integer>();
            ArrayList<Integer> c54 = new ArrayList<Integer>();
            ArrayList<Integer> c55 = new ArrayList<Integer>();
            ArrayList<Integer> c56 = new ArrayList<Integer>();
            ArrayList<Integer> c57 = new ArrayList<Integer>();
            ArrayList<Integer> c58 = new ArrayList<Integer>();
            ArrayList<Integer> c59 = new ArrayList<Integer>();
            ArrayList<Integer> c61 = new ArrayList<Integer>();
            ArrayList<Integer> c62 = new ArrayList<Integer>();
            ArrayList<Integer> c63 = new ArrayList<Integer>();
            ArrayList<Integer> c64 = new ArrayList<Integer>();
            ArrayList<Integer> c65 = new ArrayList<Integer>();
            ArrayList<Integer> c66 = new ArrayList<Integer>();
            ArrayList<Integer> c67 = new ArrayList<Integer>();
            ArrayList<Integer> c68 = new ArrayList<Integer>();
            ArrayList<Integer> c69 = new ArrayList<Integer>();


            c11.add(a1[0]);
            c12.add(a2[0]);
            c13.add(a3[0]);
            c14.add(a4[0]);
            c15.add(a5[0]);
            c16.add(a6[0]);
            c17.add(a7[0]);
            c18.add(a8[0]);
            c19.add(a9[0]);
            c21.add(a1[1]);
            c22.add(a2[1]);
            c23.add(a3[1]);
            c24.add(a4[1]);
            c25.add(a5[1]);
            c26.add(a6[1]);
            c27.add(a7[1]);
            c28.add(a8[1]);
            c29.add(a9[1]);
            c31.add(a1[2]);
            c32.add(a2[2]);
            c33.add(a3[2]);
            c34.add(a4[2]);
            c35.add(a5[2]);
            c36.add(a6[2]);
            c37.add(a7[2]);
            c38.add(a8[2]);
            c39.add(a9[2]);
            c41.add(a1[3]);
            c42.add(a2[3]);
            c43.add(a3[3]);
            c44.add(a4[3]);
            c45.add(a5[3]);
            c46.add(a6[3]);
            c47.add(a7[3]);
            c48.add(a8[3]);
            c49.add(a9[3]);
            c51.add(a1[4]);
            c52.add(a2[4]);
            c53.add(a3[4]);
            c54.add(a4[4]);
            c55.add(a5[4]);
            c56.add(a6[4]);
            c57.add(a7[4]);
            c58.add(a8[4]);
            c59.add(a9[4]);
            c61.add(a1[5]);
            c62.add(a2[5]);
            c63.add(a3[5]);
            c64.add(a4[5]);
            c65.add(a5[5]);
            c66.add(a6[5]);
            c67.add(a7[5]);
            c68.add(a8[5]);
            c69.add(a9[5]);

            List<Integer> array = new ArrayList<>();
            array.add(a1[6]);
            array.add(a1[7]);
            array.add(a1[8]);

            for (int i = 6; i < 10; i++) {
                array.add(a2[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a3[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a4[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a5[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a6[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a7[i]);
            }
            for (int i = 6; i < 10; i++) {
                array.add(a8[i]);
            }
            for (int i = 6; i < 11; i++) {
                array.add(a9[i]);
            }

            Collections.shuffle(array);
//        System.out.println(array);
//       System.out.println(array.get(0)/10);
//       c11.add(37);
//        System.out.println(c11.get(1));
//        System.out.println(c11);

//for ticket 1st
            int i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK: if (j == 0) {
                    if (c11.size() == 3) break CHECK;
                    c11.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 2) {
                    if (c13.size() == 3) break CHECK;
                    c13.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 3) {
                    if (c14.size() == 3) break CHECK;
                    c14.add(array.get(0));
                    array.remove(0);
                }
                CHECK:if (j == 4) {
                    if (c15.size() == 3) break CHECK;
                    c15.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 5) {
                    if (c16.size() == 3) break CHECK;
                    c16.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 6) {
                    if (c17.size() == 3) break CHECK;
                    c17.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 7) {
                    if (c18.size() == 3) break CHECK;
                    c18.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 8) {
                    if (c19.size() == 3) break CHECK;
                    c19.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 9) {
                    if (c19.size() == 3) break CHECK;
                    c19.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c11);
            Collections.sort(c12);
            Collections.sort(c13);
            Collections.sort(c14);
            Collections.sort(c15);
            Collections.sort(c16);
            Collections.sort(c17);
            Collections.sort(c18);
            Collections.sort(c19);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c11.size();
                int b = c12.size();
                int c = c13.size();
                int d = c14.size();
                int e = c15.size();
                int f = c16.size();
                int g = c17.size();
                int h = c18.size();
                int j = c19.size();

                if (a == 2) {
                    c11.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c12.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c13.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c14.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c15.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c16.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c17.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c18.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c18.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c18.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c19.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c19.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c19.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }

//           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c11.add(1, 0);
                        c11.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c11.add(0, 0);
                        c11.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c11.add(0, 0);
                        c11.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c12.add(1, 0);
                        c12.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c12.add(0, 0);
                        c12.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c12.add(0, 0);
                        c12.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c13.add(1, 0);
                        c13.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c13.add(0, 0);
                        c13.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c13.add(0, 0);
                        c13.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c14.add(1, 0);
                        c14.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c14.add(0, 0);
                        c14.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c14.add(0, 0);
                        c14.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c15.add(1, 0);
                        c15.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c15.add(0, 0);
                        c15.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c15.add(0, 0);
                        c15.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c16.add(1, 0);
                        c16.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c16.add(0, 0);
                        c16.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c16.add(0, 0);
                        c16.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c17.add(1, 0);
                        c17.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c17.add(0, 0);
                        c17.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c17.add(0, 0);
                        c17.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c18.add(1, 0);
                        c18.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c18.add(0, 0);
                        c18.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c18.add(0, 0);
                        c18.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c19.add(1, 0);
                        c19.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c19.add(0, 0);
                        c19.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c19.add(0, 0);
                        c19.add(1, 0);
                        rc3++;
                    }
                }


            }


            //for ticket 2nd
            i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK:  if (j == 0) {
                    if (c21.size() == 3) break CHECK;
                    c21.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 1) {
                    if (c22.size() == 3) break CHECK;
                    c22.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 2) {
                    if (c23.size() == 3) break CHECK;
                    c23.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 3) {
                    if (c24.size() == 3) break CHECK;
                    c24.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 4) {
                    if (c25.size() == 3) break CHECK;
                    c25.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 5) {
                    if (c26.size() == 3) break CHECK;
                    c26.add(array.get(0));
                    array.remove(0);
                }
                CHECK:if (j == 6) {
                    if (c27.size() == 3) break CHECK;
                    c27.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 7) {
                    if (c28.size() == 3) break CHECK;
                    c28.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 8) {
                    if (c29.size() == 3) break CHECK;
                    c29.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 9) {
                    if (c29.size() == 3) break CHECK;
                    c29.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c21);
            Collections.sort(c22);
            Collections.sort(c23);
            Collections.sort(c24);
            Collections.sort(c25);
            Collections.sort(c26);
            Collections.sort(c27);
            Collections.sort(c28);
            Collections.sort(c29);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c21.size();
                int b = c22.size();
                int c = c23.size();
                int d = c24.size();
                int e = c25.size();
                int f = c26.size();
                int g = c27.size();
                int h = c28.size();
                int j = c29.size();

                if (a == 2) {
                    c21.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c22.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c23.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c24.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c25.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c26.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c27.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c28.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c28.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c28.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c29.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c29.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c29.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }

//           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c21.add(1, 0);
                        c21.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c21.add(0, 0);
                        c21.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c21.add(0, 0);
                        c21.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c22.add(1, 0);
                        c22.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c22.add(0, 0);
                        c22.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c22.add(0, 0);
                        c22.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c23.add(1, 0);
                        c23.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c23.add(0, 0);
                        c23.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c23.add(0, 0);
                        c23.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c24.add(1, 0);
                        c24.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c24.add(0, 0);
                        c24.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c24.add(0, 0);
                        c24.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c25.add(1, 0);
                        c25.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c25.add(0, 0);
                        c25.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c25.add(0, 0);
                        c25.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c26.add(1, 0);
                        c26.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c26.add(0, 0);
                        c26.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c26.add(0, 0);
                        c26.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c27.add(1, 0);
                        c27.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c27.add(0, 0);
                        c27.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c27.add(0, 0);
                        c27.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c28.add(1, 0);
                        c28.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c28.add(0, 0);
                        c28.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c28.add(0, 0);
                        c28.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c29.add(1, 0);
                        c29.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c29.add(0, 0);
                        c29.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c29.add(0, 0);
                        c29.add(1, 0);
                        rc3++;
                    }
                }


            }

//for ticket 3rd
            i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK:  if (j == 0) {
                    if (c31.size() == 3) break CHECK;
                    c31.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 1) {
                    if (c32.size() == 3) break CHECK;
                    c32.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 2) {
                    if (c33.size() == 3) break CHECK;
                    c33.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 3) {
                    if (c34.size() == 3) break CHECK;
                    c34.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 4) {
                    if (c35.size() == 3) break CHECK;
                    c35.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 5) {
                    if (c36.size() == 3) break CHECK;
                    c36.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 6) {
                    if (c37.size() == 3) break CHECK;
                    c37.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 7) {
                    if (c38.size() == 3) break CHECK;
                    c38.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 8) {
                    if (c39.size() == 3) break CHECK;
                    c39.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 9) {
                    if (c39.size() == 3) break CHECK;
                    c39.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c31);
            Collections.sort(c32);
            Collections.sort(c33);
            Collections.sort(c34);
            Collections.sort(c35);
            Collections.sort(c36);
            Collections.sort(c37);
            Collections.sort(c38);
            Collections.sort(c39);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c31.size();
                int b = c32.size();
                int c = c33.size();
                int d = c34.size();
                int e = c35.size();
                int f = c36.size();
                int g = c37.size();
                int h = c38.size();
                int j = c39.size();

                if (a == 2) {
                    c31.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c32.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c33.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c34.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c35.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c36.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c37.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c38.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c38.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c38.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c39.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c39.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c39.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }

//           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c31.add(1, 0);
                        c31.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c31.add(0, 0);
                        c31.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c31.add(0, 0);
                        c31.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c32.add(1, 0);
                        c32.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c32.add(0, 0);
                        c32.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c32.add(0, 0);
                        c32.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c33.add(1, 0);
                        c33.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c33.add(0, 0);
                        c33.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c33.add(0, 0);
                        c33.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c34.add(1, 0);
                        c34.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c34.add(0, 0);
                        c34.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c34.add(0, 0);
                        c34.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c35.add(1, 0);
                        c35.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c35.add(0, 0);
                        c35.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c35.add(0, 0);
                        c35.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c36.add(1, 0);
                        c36.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c36.add(0, 0);
                        c36.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c36.add(0, 0);
                        c36.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c37.add(1, 0);
                        c37.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c37.add(0, 0);
                        c37.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c37.add(0, 0);
                        c37.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c38.add(1, 0);
                        c38.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c38.add(0, 0);
                        c38.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c38.add(0, 0);
                        c38.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c39.add(1, 0);
                        c39.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c39.add(0, 0);
                        c39.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c39.add(0, 0);
                        c39.add(1, 0);
                        rc3++;
                    }
                }


            }

//for ticket 4th

            i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK: if (j == 0) {
                    if (c41.size() == 3) break CHECK;
                    c41.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 1) {
                    if (c42.size() == 3) break CHECK;
                    c42.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 2) {
                    if (c43.size() == 3) break CHECK;
                    c43.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 3) {
                    if (c44.size() == 3) break CHECK;
                    c44.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 4) {
                    if (c45.size() == 3) break CHECK;
                    c45.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 5) {
                    if (c46.size() == 3) break CHECK;
                    c46.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 6) {
                    if (c47.size() == 3) break CHECK;
                    c47.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 7) {
                    if (c48.size() == 3) break CHECK;
                    c48.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 8) {
                    if (c49.size() == 3) break CHECK;
                    c49.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 9) {
                    if (c49.size() == 3) break CHECK;
                    c49.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c41);
            Collections.sort(c42);
            Collections.sort(c43);
            Collections.sort(c44);
            Collections.sort(c45);
            Collections.sort(c46);
            Collections.sort(c47);
            Collections.sort(c48);
            Collections.sort(c49);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c41.size();
                int b = c42.size();
                int c = c43.size();
                int d = c44.size();
                int e = c45.size();
                int f = c46.size();
                int g = c47.size();
                int h = c48.size();
                int j = c49.size();

                if (a == 2) {
                    c41.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c42.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c43.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c44.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c45.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c46.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c47.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c48.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c48.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c48.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c49.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c49.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c49.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }

//           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c41.add(1, 0);
                        c41.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c41.add(0, 0);
                        c41.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c41.add(0, 0);
                        c41.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c42.add(1, 0);
                        c42.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c42.add(0, 0);
                        c42.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c42.add(0, 0);
                        c42.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c43.add(1, 0);
                        c43.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c43.add(0, 0);
                        c43.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c43.add(0, 0);
                        c43.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c44.add(1, 0);
                        c44.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c44.add(0, 0);
                        c44.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c44.add(0, 0);
                        c44.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c45.add(1, 0);
                        c45.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c45.add(0, 0);
                        c45.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c45.add(0, 0);
                        c45.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c46.add(1, 0);
                        c46.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c46.add(0, 0);
                        c46.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c46.add(0, 0);
                        c46.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c47.add(1, 0);
                        c47.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c47.add(0, 0);
                        c47.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c47.add(0, 0);
                        c47.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c48.add(1, 0);
                        c48.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c48.add(0, 0);
                        c48.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c48.add(0, 0);
                        c48.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c49.add(1, 0);
                        c49.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c49.add(0, 0);
                        c49.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c49.add(0, 0);
                        c49.add(1, 0);
                        rc3++;
                    }
                }

            }

            //5th ticket

            i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK:  if (j == 0) {
                    if (c51.size() == 3) break CHECK;
                    c51.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 1) {
                    if (c52.size() == 3) break CHECK;
                    c52.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 2) {
                    if (c53.size() == 3) break CHECK;
                    c53.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 3) {
                    if (c54.size() == 3) break CHECK;
                    c54.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 4) {
                    if (c55.size() == 3) break CHECK;
                    c55.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 5) {
                    if (c56.size() == 3) break CHECK;
                    c56.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 6) {
                    if (c57.size() == 3) break CHECK;
                    c57.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 7) {
                    if (c58.size() == 3) break CHECK;
                    c58.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 8) {
                    if (c59.size() == 3) break CHECK;
                    c59.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 9) {
                    if (c59.size() == 3) break CHECK;
                    c59.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c51);
            Collections.sort(c52);
            Collections.sort(c53);
            Collections.sort(c54);
            Collections.sort(c55);
            Collections.sort(c56);
            Collections.sort(c57);
            Collections.sort(c58);
            Collections.sort(c59);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c51.size();
                int b = c52.size();
                int c = c53.size();
                int d = c54.size();
                int e = c55.size();
                int f = c56.size();
                int g = c57.size();
                int h = c58.size();
                int j = c59.size();

                if (a == 2) {
                    c51.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c52.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c53.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c54.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c55.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c56.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c57.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c58.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c58.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c58.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c59.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c59.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c59.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }

//           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c51.add(1, 0);
                        c51.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c51.add(0, 0);
                        c51.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c51.add(0, 0);
                        c51.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c52.add(1, 0);
                        c52.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c52.add(0, 0);
                        c52.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c52.add(0, 0);
                        c52.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c53.add(1, 0);
                        c53.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c53.add(0, 0);
                        c53.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c53.add(0, 0);
                        c53.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c54.add(1, 0);
                        c54.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c54.add(0, 0);
                        c54.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c54.add(0, 0);
                        c54.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c55.add(1, 0);
                        c55.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c55.add(0, 0);
                        c55.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c55.add(0, 0);
                        c55.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c56.add(1, 0);
                        c56.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c56.add(0, 0);
                        c56.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c56.add(0, 0);
                        c56.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c57.add(1, 0);
                        c57.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c57.add(0, 0);
                        c57.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c57.add(0, 0);
                        c57.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c58.add(1, 0);
                        c58.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c58.add(0, 0);
                        c58.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c58.add(0, 0);
                        c58.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c59.add(1, 0);
                        c59.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c59.add(0, 0);
                        c59.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c59.add(0, 0);
                        c59.add(1, 0);
                        rc3++;
                    }
                }

            }
            //6th ticket
            i = 6;
            while (i > 0) {
                Collections.shuffle(array);
                int j = (array.get(0) / 10);

                CHECK:  if (j == 0) {
                    if (c61.size() == 3) break CHECK;
                    c61.add(array.get(0));
                    array.remove(0);
                }

                CHECK:  if (j == 1) {
                    if (c62.size() == 3) break CHECK;
                    c62.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 2) {
                    if (c63.size() == 3) break CHECK;
                    c63.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 3) {
                    if (c64.size() == 3) break CHECK;
                    c64.add(array.get(0));
                    array.remove(0);
                }
                CHECK: if (j == 4) {
                    if (c65.size() == 3) break CHECK;
                    c65.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 5) {
                    if (c66.size() == 3) break CHECK;
                    c66.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 6) {
                    if (c67.size() == 3) break CHECK;
                    c67.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 7) {
                    if (c68.size() == 3) break CHECK;
                    c68.add(array.get(0));
                    array.remove(0);
                }

                CHECK: if (j == 8) {
                    if (c69.size() == 3) break CHECK;
                    c69.add(array.get(0));
                    array.remove(0);
                }
                CHECK:  if (j == 9) {
                    if (c69.size() == 3) break CHECK;
                    c69.add(array.get(0));
                    array.remove(0);
                }

                i--;
            }
            Collections.sort(c61);
            Collections.sort(c62);
            Collections.sort(c63);
            Collections.sort(c64);
            Collections.sort(c65);
            Collections.sort(c66);
            Collections.sort(c67);
            Collections.sort(c68);
            Collections.sort(c69);
            {
                int rc1 = 0;
                int rc2 = 0;
                int rc3 = 0;
//            int[ ] rcar={rc1,rc2,rc3};
                int a = c61.size();
                int b = c62.size();
                int c = c63.size();
                int d = c64.size();
                int e = c65.size();
                int f = c66.size();
                int g = c67.size();
                int h = c68.size();
                int j = c69.size();

                if (a == 2) {
                    c61.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (b == 2) {
                    c62.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (c == 2) {
                    c63.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (d == 2) {
                    c64.add(0, 0);
                    rc2++;
                    rc3++;
                }
                if (e == 2) {
                    c65.add(1, 0);
                    rc1++;
                    rc3++;
                }
                if (f == 2) {
                    c66.add(2, 0);
                    rc1++;
                    rc2++;
                }

                if (g == 2) {
                    c67.add(0, 0);
                    rc2++;
                    rc3++;
                }

                if (h == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c68.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c68.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c68.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }


                if (j == 2) {
                    if ((rc1 >= rc2) && (rc1 >= rc3)) {
                        c69.add(0, 0);
                        rc2++;
                        rc3++;
                    } else if ((rc2 >= rc1) && (rc2 >= rc3)) {
                        c69.add(1, 0);
                        rc1++;
                        rc3++;
                    } else if ((rc3 >= rc1) && (rc3 >= rc3)) {
                        c69.add(2, 0);
                        rc1++;
                        rc2++;
                    }
                }
                //           Arrays.sort(rcar);
                if (a == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c61.add(1, 0);
                        c61.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c61.add(0, 0);
                        c61.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c61.add(0, 0);
                        c61.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (b == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c62.add(1, 0);
                        c62.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c62.add(0, 0);
                        c62.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c62.add(0, 0);
                        c62.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (c == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c63.add(1, 0);
                        c63.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c63.add(0, 0);
                        c63.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c63.add(0, 0);
                        c63.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (d == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c64.add(1, 0);
                        c64.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c64.add(0, 0);
                        c64.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c64.add(0, 0);
                        c64.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (e == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c65.add(1, 0);
                        c65.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c65.add(0, 0);
                        c65.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c65.add(0, 0);
                        c65.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (f == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c66.add(1, 0);
                        c66.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c66.add(0, 0);
                        c66.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c66.add(0, 0);
                        c66.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (g == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c67.add(1, 0);
                        c67.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c67.add(0, 0);
                        c67.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c67.add(0, 0);
                        c67.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (h == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c68.add(1, 0);
                        c68.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c68.add(0, 0);
                        c68.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c68.add(0, 0);
                        c68.add(1, 0);
                        rc3++;
                    }
                }
//            Arrays.sort(rcar);
                if (j == 1) {
                    if ((rc1 <= rc2) && (rc1 <= rc3)) {
                        c69.add(1, 0);
                        c69.add(2, 0);
                        rc1++;
                    } else if ((rc2 <= rc1) && (rc2 <= rc3)) {
                        c69.add(0, 0);
                        c69.add(2, 0);
                        rc2++;
                    } else if ((rc3 <= rc1) && (rc3 <= rc2)) {
                        c69.add(0, 0);
                        c69.add(1, 0);
                        rc3++;
                    }
                }
            }
            //        System.out.println(array);
//        System.out.println(c11);
//        System.out.println(c12);
//        System.out.println(c13);
//        System.out.println(c14);
//        System.out.println(c15);
//        System.out.println(c16);
//        System.out.println(c17);
//        System.out.println(c18);
//        System.out.println(c19);
            Integer[] s11 = new Integer[c11.size()];
            c11.toArray(s11);
            Integer[] s12 = new Integer[c12.size()];
            c12.toArray(s12);
            Integer[] s13 = new Integer[c13.size()];
            c13.toArray(s13);
            Integer[] s14 = new Integer[c14.size()];
            c14.toArray(s14);
            Integer[] s15 = new Integer[c15.size()];
            c15.toArray(s15);
            Integer[] s16 = new Integer[c16.size()];
            c16.toArray(s16);
            Integer[] s17 = new Integer[c17.size()];
            c17.toArray(s17);
            Integer[] s18 = new Integer[c18.size()];
            c18.toArray(s18);
            Integer[] s19 = new Integer[c19.size()];
            c19.toArray(s19);

//        System.out.println(Arrays.toString(s11));
            // Integer[][] p={s11,s12};
//        System.out.println(Arrays.deepToString(p));
            Integer[] s21 = new Integer[c21.size()];
            c21.toArray(s21);
            Integer[] s22 = new Integer[c22.size()];
            c22.toArray(s22);
            Integer[] s23 = new Integer[c23.size()];
            c23.toArray(s23);
            Integer[] s24 = new Integer[c24.size()];
            c24.toArray(s24);
            Integer[] s25 = new Integer[c25.size()];
            c25.toArray(s25);
            Integer[] s26 = new Integer[c26.size()];
            c26.toArray(s26);
            Integer[] s27 = new Integer[c27.size()];
            c27.toArray(s27);
            Integer[] s28 = new Integer[c28.size()];
            c28.toArray(s28);
            Integer[] s29 = new Integer[c29.size()];
            c29.toArray(s29);

            Integer[] s31 = new Integer[c31.size()];
            c31.toArray(s31);
            Integer[] s32 = new Integer[c32.size()];
            c32.toArray(s32);
            Integer[] s33 = new Integer[c33.size()];
            c33.toArray(s33);
            Integer[] s34 = new Integer[c34.size()];
            c34.toArray(s34);
            Integer[] s35 = new Integer[c35.size()];
            c35.toArray(s35);
            Integer[] s36 = new Integer[c36.size()];
            c36.toArray(s36);
            Integer[] s37 = new Integer[c37.size()];
            c37.toArray(s37);
            Integer[] s38 = new Integer[c38.size()];
            c38.toArray(s38);
            Integer[] s39 = new Integer[c39.size()];
            c39.toArray(s39);

            Integer[] s41 = new Integer[c41.size()];
            c41.toArray(s41);
            Integer[] s42 = new Integer[c42.size()];
            c42.toArray(s42);
            Integer[] s43 = new Integer[c43.size()];
            c43.toArray(s43);
            Integer[] s44 = new Integer[c44.size()];
            c44.toArray(s44);
            Integer[] s45 = new Integer[c45.size()];
            c45.toArray(s45);
            Integer[] s46 = new Integer[c46.size()];
            c46.toArray(s46);
            Integer[] s47 = new Integer[c47.size()];
            c47.toArray(s47);
            Integer[] s48 = new Integer[c48.size()];
            c48.toArray(s48);
            Integer[] s49 = new Integer[c49.size()];
            c49.toArray(s49);

            Integer[] s51 = new Integer[c51.size()];
            c51.toArray(s51);
            Integer[] s52 = new Integer[c52.size()];
            c52.toArray(s52);
            Integer[] s53 = new Integer[c53.size()];
            c53.toArray(s53);
            Integer[] s54 = new Integer[c54.size()];
            c54.toArray(s54);
            Integer[] s55 = new Integer[c55.size()];
            c55.toArray(s55);
            Integer[] s56 = new Integer[c56.size()];
            c56.toArray(s56);
            Integer[] s57 = new Integer[c57.size()];
            c57.toArray(s57);
            Integer[] s58 = new Integer[c58.size()];
            c58.toArray(s58);
            Integer[] s59 = new Integer[c59.size()];
            c59.toArray(s59);

            Integer[] s61 = new Integer[c61.size()];
            c61.toArray(s61);
            Integer[] s62 = new Integer[c62.size()];
            c62.toArray(s62);
            Integer[] s63 = new Integer[c63.size()];
            c63.toArray(s63);
            Integer[] s64 = new Integer[c64.size()];
            c64.toArray(s64);
            Integer[] s65 = new Integer[c65.size()];
            c65.toArray(s65);
            Integer[] s66 = new Integer[c66.size()];
            c66.toArray(s66);
            Integer[] s67 = new Integer[c67.size()];
            c67.toArray(s67);
            Integer[] s68 = new Integer[c68.size()];
            c68.toArray(s68);
            Integer[] s69 = new Integer[c69.size()];
            c69.toArray(s69);

            Ticket t1 = new Ticket();
            Ticket t2 = new Ticket();
            Ticket t3 = new Ticket();
            Ticket t4 = new Ticket();
            Ticket t5 = new Ticket();
            Ticket t6 = new Ticket();

            Integer[][] n1 = {s11, s12, s13, s14, s15, s16, s17, s18, s19};
            Integer[][] n2 = {s21, s22, s23, s24, s25, s26, s27, s28, s29};
            Integer[][] n3 = {s31, s32, s33, s34, s35, s36, s37, s38, s39};
            Integer[][] n4 = {s41, s42, s43, s44, s45, s46, s47, s48, s49};
            Integer[][] n5 = {s51, s52, s53, s54, s55, s56, s57, s58, s59};
            Integer[][] n6 = {s61, s62, s63, s64, s65, s66, s67, s68, s69};

            t1.setArr(Arrays.deepToString(n1));
            t2.setArr(Arrays.deepToString(n2));
            t3.setArr(Arrays.deepToString(n3));
            t4.setArr(Arrays.deepToString(n4));
            t5.setArr(Arrays.deepToString(n5));
            t6.setArr(Arrays.deepToString(n6));

          try{
              ticketRepository.save(t1);
              ticketRepository.save(t2);
              ticketRepository.save(t3);
              ticketRepository.save(t4);
              ticketRepository.save(t5);
              ticketRepository.save(t6);
          }
          catch (Exception e){
              e.printStackTrace();
          }
            logger.info(" tickets of  Set No. :{} generated!!",setNo);
            setNo++;
            n--;
        }
    } catch (Exception e) {
            e.printStackTrace();
        }}

        public PageableResponse<Ticket> getAll(int pageNumber, int pageSize, String sortBy, String sortDir) {
        Sort sort = (sortDir.equalsIgnoreCase("desc")) ? (Sort.by(sortBy).descending()) : (Sort.by(sortBy).ascending());
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
        Page<Ticket> page = ticketRepository.findAll(pageable);
        PageableResponse<Ticket> response = new PageableResponse<>();
        response.setContent(page.getContent());
        response.setPageNumber(page.getNumber());
        response.setPageSize(page.getSize());
        response.setTotalElements(page.getTotalElements());
        response.setTotalpages(page.getTotalPages());
        response.setLastPage(page.isLast());
        return response;
    }
}
