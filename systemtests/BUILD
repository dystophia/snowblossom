package(default_visibility = ["//visibility:public"])

java_test(
    name = "systemtests.test.SpoonTestBasic",
    test_class = "systemtests.test.SpoonTestBasic",
    srcs = ["test/SpoonTest.java", "test/SpoonTestBasic.java"],
    deps = [
        "//lib:lib",
        "//lib:rocksdb",
        "//protolib:protogrpc",
        "//miner:miner",
        "//node",
        "//client:client",
        "//shackleton:shackleton",
        "@duckutil//:duckutil_lib",
        "@build_stack_rules_proto//java:grpc_netty",
    ],
    size = "medium",
)

java_test(
    name = "systemtests.test.SpoonTestFbo",
    test_class = "systemtests.test.SpoonTestFbo",
    srcs = ["test/SpoonTest.java", "test/SpoonTestFbo.java"],
    deps = [
        "//lib:lib",
        "//lib:rocksdb",
        "//protolib:protogrpc",
        "//miner:miner",
        "//node",
        "//client:client",
        "//shackleton:shackleton",
        "@duckutil//:duckutil_lib",
        "@build_stack_rules_proto//java:grpc_netty",
    ],
    size = "medium",
)

java_test(
    name = "systemtests.test.SpoonTestPool",
    test_class = "systemtests.test.SpoonTestPool",
    srcs = ["test/SpoonTest.java", "test/SpoonTestPool.java"],
    deps = [
        "//lib:lib",
        "//lib:rocksdb",
        "//protolib:protogrpc",
        "//miner:miner",
        "//node",
        "//client:client",
        "//shackleton:shackleton",
        "@duckutil//:duckutil_lib",
        "@build_stack_rules_proto//java:grpc_netty",
    ],
    size = "medium",
)

java_test(
    name = "systemtests.test.SpoonTestReconsile",
    test_class = "systemtests.test.SpoonTestReconsile",
    srcs = ["test/SpoonTest.java", "test/SpoonTestReconsile.java"],
    deps = [
        "//lib:lib",
        "//lib:rocksdb",
        "//protolib:protogrpc",
        "//miner:miner",
        "//node",
        "//client:client",
        "//shackleton:shackleton",
        "@duckutil//:duckutil_lib",
        "@build_stack_rules_proto//java:grpc_netty",
    ],
    size = "medium",
)

