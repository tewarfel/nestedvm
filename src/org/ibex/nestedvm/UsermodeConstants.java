// THIS FILE IS AUTOGENERATED! DO NOT EDIT!
// run "make rebuild-constants" if it needs to be updated

package org.ibex.nestedvm;
public interface UsermodeConstants {
    public static final int SYS_null = 0;
    public static final int SYS_exit = 1;
    public static final int SYS_pause = 2;
    public static final int SYS_open = 3;
    public static final int SYS_close = 4;
    public static final int SYS_read = 5;
    public static final int SYS_write = 6;
    public static final int SYS_sbrk = 7;
    public static final int SYS_fstat = 8;
    public static final int SYS_lseek = 10;
    public static final int SYS_kill = 11;
    public static final int SYS_getpid = 12;
    public static final int SYS_calljava = 13;
    public static final int SYS_stat = 14;
    public static final int SYS_gettimeofday = 15;
    public static final int SYS_sleep = 16;
    public static final int SYS_times = 17;
    public static final int SYS_mkdir = 18;
    public static final int SYS_getpagesize = 19;
    public static final int SYS_unlink = 20;
    public static final int SYS_utime = 21;
    public static final int SYS_chdir = 22;
    public static final int SYS_pipe = 23;
    public static final int SYS_dup2 = 24;
    public static final int SYS_fork = 25;
    public static final int SYS_waitpid = 26;
    public static final int SYS_getcwd = 27;
    public static final int SYS_exec = 28;
    public static final int SYS_fcntl = 29;
    public static final int SYS_rmdir = 30;
    public static final int SYS_sysconf = 31;
    public static final int SYS_readlink = 32;
    public static final int SYS_lstat = 33;
    public static final int SYS_symlink = 34;
    public static final int SYS_link = 35;
    public static final int SYS_getdents = 36;
    public static final int SYS_memcpy = 37;
    public static final int SYS_memset = 38;
    public static final int SYS_dup = 39;
    public static final int SYS_vfork = 40;
    public static final int SYS_chroot = 41;
    public static final int SYS_mknod = 42;
    public static final int SYS_lchown = 43;
    public static final int SYS_ftruncate = 44;
    public static final int SYS_usleep = 45;
    public static final int SYS_getppid = 46;
    public static final int SYS_mkfifo = 47;
    public static final int SYS_opensocket = 48;
    public static final int SYS_listensocket = 49;
    public static final int SYS_accept = 50;
    public static final int EPERM = 1; /* Not super-user */
    public static final int ENOENT = 2; /* No such file or directory */
    public static final int ESRCH = 3; /* No such process */
    public static final int EINTR = 4; /* Interrupted system call */
    public static final int EIO = 5; /* I/O error */
    public static final int ENXIO = 6; /* No such device or address */
    public static final int E2BIG = 7; /* Arg list too long */
    public static final int ENOEXEC = 8; /* Exec format error */
    public static final int EBADF = 9; /* Bad file number */
    public static final int ECHILD = 10; /* No children */
    public static final int EAGAIN = 11; /* No more processes */
    public static final int ENOMEM = 12; /* Not enough core */
    public static final int EACCES = 13; /* Permission denied */
    public static final int EFAULT = 14; /* Bad address */
    public static final int ENOTBLK = 15; /* Block device required */
    public static final int EBUSY = 16; /* Mount device busy */
    public static final int EEXIST = 17; /* File exists */
    public static final int EXDEV = 18; /* Cross-device link */
    public static final int ENODEV = 19; /* No such device */
    public static final int ENOTDIR = 20; /* Not a directory */
    public static final int EISDIR = 21; /* Is a directory */
    public static final int EINVAL = 22; /* Invalid argument */
    public static final int ENFILE = 23; /* Too many open files in system */
    public static final int EMFILE = 24; /* Too many open files */
    public static final int ENOTTY = 25; /* Not a typewriter */
    public static final int ETXTBSY = 26; /* Text file busy */
    public static final int EFBIG = 27; /* File too large */
    public static final int ENOSPC = 28; /* No space left on device */
    public static final int ESPIPE = 29; /* Illegal seek */
    public static final int EROFS = 30; /* Read only file system */
    public static final int EMLINK = 31; /* Too many links */
    public static final int EPIPE = 32; /* Broken pipe */
    public static final int EDOM = 33; /* Math arg out of domain of func */
    public static final int ERANGE = 34; /* Math result not representable */
    public static final int ENOMSG = 35; /* No message of desired type */
    public static final int EIDRM = 36; /* Identifier removed */
    public static final int ECHRNG = 37; /* Channel number out of range */
    public static final int EL2NSYNC = 38; /* Level 2 not synchronized */
    public static final int EL3HLT = 39; /* Level 3 halted */
    public static final int EL3RST = 40; /* Level 3 reset */
    public static final int ELNRNG = 41; /* Link number out of range */
    public static final int EUNATCH = 42; /* Protocol driver not attached */
    public static final int ENOCSI = 43; /* No CSI structure available */
    public static final int EL2HLT = 44; /* Level 2 halted */
    public static final int EDEADLK = 45; /* Deadlock condition */
    public static final int ENOLCK = 46; /* No record locks available */
    public static final int EBADE = 50; /* Invalid exchange */
    public static final int EBADR = 51; /* Invalid request descriptor */
    public static final int EXFULL = 52; /* Exchange full */
    public static final int ENOANO = 53; /* No anode */
    public static final int EBADRQC = 54; /* Invalid request code */
    public static final int EBADSLT = 55; /* Invalid slot */
    public static final int EDEADLOCK = 56; /* File locking deadlock error */
    public static final int EBFONT = 57; /* Bad font file fmt */
    public static final int ENOSTR = 60; /* Device not a stream */
    public static final int ENODATA = 61; /* No data (for no delay io) */
    public static final int ETIME = 62; /* Timer expired */
    public static final int ENOSR = 63; /* Out of streams resources */
    public static final int ENONET = 64; /* Machine is not on the network */
    public static final int ENOPKG = 65; /* Package not installed */
    public static final int EREMOTE = 66; /* The object is remote */
    public static final int ENOLINK = 67; /* The link has been severed */
    public static final int EADV = 68; /* Advertise error */
    public static final int ESRMNT = 69; /* Srmount error */
    public static final int ECOMM = 70; /* Communication error on send */
    public static final int EPROTO = 71; /* Protocol error */
    public static final int EMULTIHOP = 74; /* Multihop attempted */
    public static final int ELBIN = 75; /* Inode is remote (not really error) */
    public static final int EDOTDOT = 76; /* Cross mount point (not really error) */
    public static final int EBADMSG = 77; /* Trying to read unreadable message */
    public static final int EFTYPE = 79; /* Inappropriate file type or format */
    public static final int ENOTUNIQ = 80; /* Given log. name not unique */
    public static final int EBADFD = 81; /* f.d. invalid for this operation */
    public static final int EREMCHG = 82; /* Remote address changed */
    public static final int ELIBACC = 83; /* Can't access a needed shared lib */
    public static final int ELIBBAD = 84; /* Accessing a corrupted shared lib */
    public static final int ELIBSCN = 85; /* .lib section in a.out corrupted */
    public static final int ELIBMAX = 86; /* Attempting to link in too many libs */
    public static final int ELIBEXEC = 87; /* Attempting to exec a shared library */
    public static final int ENOSYS = 88; /* Function not implemented */
    public static final int ENMFILE = 89; /* No more files */
    public static final int ENOTEMPTY = 90; /* Directory not empty */
    public static final int ENAMETOOLONG = 91; /* File or path name too long */
    public static final int ELOOP = 92; /* Too many symbolic links */
    public static final int EOPNOTSUPP = 95; /* Operation not supported on transport endpoint */
    public static final int EPFNOSUPPORT = 96; /* Protocol family not supported */
    public static final int ECONNRESET = 104; /* Connection reset by peer */
    public static final int ENOBUFS = 105; /* No buffer space available */
    public static final int EAFNOSUPPORT = 106; /* Address family not supported by protocol family */
    public static final int EPROTOTYPE = 107; /* Protocol wrong type for socket */
    public static final int ENOTSOCK = 108; /* Socket operation on non-socket */
    public static final int ENOPROTOOPT = 109; /* Protocol not available */
    public static final int ESHUTDOWN = 110; /* Can't send after socket shutdown */
    public static final int ECONNREFUSED = 111; /* Connection refused */
    public static final int EADDRINUSE = 112; /* Address already in use */
    public static final int ECONNABORTED = 113; /* Connection aborted */
    public static final int ENETUNREACH = 114; /* Network is unreachable */
    public static final int ENETDOWN = 115; /* Network interface is not configured */
    public static final int ETIMEDOUT = 116; /* Connection timed out */
    public static final int EHOSTDOWN = 117; /* Host is down */
    public static final int EHOSTUNREACH = 118; /* Host is unreachable */
    public static final int EINPROGRESS = 119; /* Connection already in progress */
    public static final int EALREADY = 120; /* Socket already connected */
    public static final int EDESTADDRREQ = 121; /* Destination address required */
    public static final int EMSGSIZE = 122; /* Message too long */
    public static final int EPROTONOSUPPORT = 123; /* Unknown protocol */
    public static final int ESOCKTNOSUPPORT = 124; /* Socket type not supported */
    public static final int EADDRNOTAVAIL = 125; /* Address not available */
    public static final int ENETRESET = 126;
    public static final int EISCONN = 127; /* Socket is already connected */
    public static final int ENOTCONN = 128; /* Socket is not connected */
    public static final int ETOOMANYREFS = 129;
    public static final int EPROCLIM = 130;
    public static final int EUSERS = 131;
    public static final int EDQUOT = 132;
    public static final int ESTALE = 133;
    public static final int ENOTSUP = 134; /* Not supported */
    public static final int ENOMEDIUM = 135; /* No medium (in tape drive) */
    public static final int ENOSHARE = 136; /* No such host or network path */
    public static final int ECASECLASH = 137; /* Filename exists with different case */
    public static final int EILSEQ = 138;
    public static final int EOVERFLOW = 139; /* Value too large for defined data type */
    public static final int __ELASTERROR = 2000; /* Users can add values starting here */
    public static final int F_OK = 0;
    public static final int R_OK = 4;
    public static final int W_OK = 2;
    public static final int X_OK = 1;
    public static final int SEEK_SET = 0;
    public static final int SEEK_CUR = 1;
    public static final int SEEK_END = 2;
    public static final int STDIN_FILENO = 0; /* standard input file descriptor */
    public static final int STDOUT_FILENO = 1; /* standard output file descriptor */
    public static final int STDERR_FILENO = 2; /* standard error file descriptor */
    public static final int _SC_ARG_MAX = 0;
    public static final int _SC_CHILD_MAX = 1;
    public static final int _SC_CLK_TCK = 2;
    public static final int _SC_NGROUPS_MAX = 3;
    public static final int _SC_OPEN_MAX = 4;
    public static final int _SC_JOB_CONTROL = 5;
    public static final int _SC_SAVED_IDS = 6;
    public static final int _SC_VERSION = 7;
    public static final int _SC_PAGESIZE = 8;
    public static final int _SC_NPROCESSORS_CONF = 9;
    public static final int _SC_NPROCESSORS_ONLN = 10;
    public static final int _SC_PHYS_PAGES = 11;
    public static final int _SC_AVPHYS_PAGES = 12;
    public static final int _SC_MQ_OPEN_MAX = 13;
    public static final int _SC_MQ_PRIO_MAX = 14;
    public static final int _SC_RTSIG_MAX = 15;
    public static final int _SC_SEM_NSEMS_MAX = 16;
    public static final int _SC_SEM_VALUE_MAX = 17;
    public static final int _SC_SIGQUEUE_MAX = 18;
    public static final int _SC_TIMER_MAX = 19;
    public static final int _SC_TZNAME_MAX = 20;
    public static final int _SC_ASYNCHRONOUS_IO = 21;
    public static final int _SC_FSYNC = 22;
    public static final int _SC_MAPPED_FILES = 23;
    public static final int _SC_MEMLOCK = 24;
    public static final int _SC_MEMLOCK_RANGE = 25;
    public static final int _SC_MEMORY_PROTECTION = 26;
    public static final int _SC_MESSAGE_PASSING = 27;
    public static final int _SC_PRIORITIZED_IO = 28;
    public static final int _SC_REALTIME_SIGNALS = 29;
    public static final int _SC_SEMAPHORES = 30;
    public static final int _SC_SHARED_MEMORY_OBJECTS = 31;
    public static final int _SC_SYNCHRONIZED_IO = 32;
    public static final int _SC_TIMERS = 33;
    public static final int _SC_AIO_LISTIO_MAX = 34;
    public static final int _SC_AIO_MAX = 35;
    public static final int _SC_AIO_PRIO_DELTA_MAX = 36;
    public static final int _SC_DELAYTIMER_MAX = 37;
    public static final int _SC_THREAD_KEYS_MAX = 38;
    public static final int _SC_THREAD_STACK_MIN = 39;
    public static final int _SC_THREAD_THREADS_MAX = 40;
    public static final int _SC_TTY_NAME_MAX = 41;
    public static final int _SC_THREADS = 42;
    public static final int _SC_THREAD_ATTR_STACKADDR = 43;
    public static final int _SC_THREAD_ATTR_STACKSIZE = 44;
    public static final int _SC_THREAD_PRIORITY_SCHEDULING = 45;
    public static final int _SC_THREAD_PRIO_INHERIT = 46;
    public static final int _SC_THREAD_PRIO_PROTECT = 47;
    public static final int _SC_THREAD_PROCESS_SHARED = 48;
    public static final int _SC_THREAD_SAFE_FUNCTIONS = 49;
    public static final int _SC_GETGR_R_SIZE_MAX = 50;
    public static final int _SC_GETPW_R_SIZE_MAX = 51;
    public static final int _SC_LOGIN_NAME_MAX = 52;
    public static final int _SC_THREAD_DESTRUCTOR_ITERATIONS = 53;
    public static final int _SC_STREAM_MAX = 100;
    public static final int _SC_PRIORITY_SCHEDULING = 101;
    public static final int _PC_LINK_MAX = 0;
    public static final int _PC_MAX_CANON = 1;
    public static final int _PC_MAX_INPUT = 2;
    public static final int _PC_NAME_MAX = 3;
    public static final int _PC_PATH_MAX = 4;
    public static final int _PC_PIPE_BUF = 5;
    public static final int _PC_CHOWN_RESTRICTED = 6;
    public static final int _PC_NO_TRUNC = 7;
    public static final int _PC_VDISABLE = 8;
    public static final int _PC_ASYNC_IO = 9;
    public static final int _PC_PRIO_IO = 10;
    public static final int _PC_SYNC_IO = 11;
    public static final int _PC_POSIX_PERMISSIONS = 90;
    public static final int _PC_POSIX_SECURITY = 91;
    public static final int MAXPATHLEN = 1024;
    public static final int ARG_MAX = 65536; /* max bytes for an exec function */
    public static final int CHILD_MAX = 40; /* max simultaneous processes */
    public static final int LINK_MAX = 32767; /* max file link count */
    public static final int MAX_CANON = 255; /* max bytes in term canon input line */
    public static final int MAX_INPUT = 255; /* max bytes in terminal input */
    public static final int NAME_MAX = 255; /* max bytes in a file name */
    public static final int NGROUPS_MAX = 16; /* max supplemental group id's */
    public static final int OPEN_MAX = 64; /* max open files per process */
    public static final int PATH_MAX = 1024; /* max bytes in pathname */
    public static final int PIPE_BUF = 512; /* max bytes for atomic pipe writes */
    public static final int IOV_MAX = 1024; /* max elements in i/o vector */
    public static final int BC_BASE_MAX = 99; /* max ibase/obase values in bc(1) */
    public static final int BC_DIM_MAX = 2048; /* max array elements in bc(1) */
    public static final int BC_SCALE_MAX = 99; /* max scale value in bc(1) */
    public static final int BC_STRING_MAX = 1000; /* max const string length in bc(1) */
    public static final int COLL_WEIGHTS_MAX = 0; /* max weights for order keyword */
    public static final int EXPR_NEST_MAX = 32; /* max expressions nested in expr(1) */
    public static final int LINE_MAX = 2048; /* max bytes in an input line */
    public static final int RE_DUP_MAX = 255; /* max RE's in interval notation */
    public static final int F_UNLKSYS = 4;
    public static final int F_CNVT = 12;
    public static final int F_SETFD = 2;
    public static final int F_SETFL = 4;
    public static final int F_SETLK = 8;
    public static final int F_SETOWN = 6;
    public static final int F_RDLCK = 1;
    public static final int F_WRLCK = 2;
    public static final int F_SETLKW = 9;
    public static final int F_GETFD = 1;
    public static final int F_DUPFD = 0;
    public static final int O_WRONLY = 1;
    public static final int F_RSETLKW = 13;
    public static final int O_RDWR = 2;
    public static final int F_RGETLK = 10;
    public static final int O_RDONLY = 0;
    public static final int F_UNLCK = 3;
    public static final int F_GETOWN = 5;
    public static final int F_RSETLK = 11;
    public static final int F_GETFL = 3;
    public static final int F_GETLK = 7;
}
