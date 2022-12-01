// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ServerBuffChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServerBuffChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServerBuffChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServerBuffChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServerBuffChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cServerBuffChangeNotify.proto\u001a\u0010ServerBuff.proto\"\u00cc\u0002\n\u0016ServerBuffChangeNotify\u0012M\n\u0017server_buff_change_type\u0018\u0007 \u0001(\u000e2,.ServerBuffChangeNotify.ServerBuffChangeType\u0012\u0018\n\u0010is_creature_buff\u0018\n \u0001(\b\u0012\u0016\n\u000eentity_id_list\u0018\u0001 \u0003(\r\u0012\u0018\n\u0010avatar_guid_list\u0018\f \u0003(\u0004\u0012%\n\u0010server_buff_list\u0018\u000b \u0003(\u000b2\u000b.ServerBuff\"p\n\u0014ServerBuffChangeType\u0012+\n'SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF\u0010\u0000\u0012+\n'SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServerBuffChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ServerBuffOuterClass.getDescriptor() });
        internal_static_ServerBuffChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServerBuffChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_descriptor, new String[] { "ServerBuffChangeType", "IsCreatureBuff", "EntityIdList", "AvatarGuidList", "ServerBuffList" });
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class ServerBuffChangeNotify extends GeneratedMessageV3 implements ServerBuffChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_BUFF_CHANGE_TYPE_FIELD_NUMBER = 7;
        private int serverBuffChangeType_;
        public static final int IS_CREATURE_BUFF_FIELD_NUMBER = 10;
        private boolean isCreatureBuff_;
        public static final int ENTITY_ID_LIST_FIELD_NUMBER = 1;
        private Internal.IntList entityIdList_;
        private int entityIdListMemoizedSerializedSize;
        public static final int AVATAR_GUID_LIST_FIELD_NUMBER = 12;
        private Internal.LongList avatarGuidList_;
        private int avatarGuidListMemoizedSerializedSize;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 11;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        private byte memoizedIsInitialized;
        private static final ServerBuffChangeNotify DEFAULT_INSTANCE;
        private static final Parser<ServerBuffChangeNotify> PARSER;
        
        private ServerBuffChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.entityIdListMemoizedSerializedSize = -1;
            this.avatarGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ServerBuffChangeNotify() {
            this.entityIdListMemoizedSerializedSize = -1;
            this.avatarGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.serverBuffChangeType_ = 0;
            this.entityIdList_ = GeneratedMessageV3.emptyIntList();
            this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
            this.serverBuffList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServerBuffChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServerBuffChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.entityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.entityIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.entityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.entityIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.serverBuffChangeType_ = rawValue;
                            continue;
                        }
                        case 80: {
                            this.isCreatureBuff_ = input.readBool();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.avatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.avatarGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.avatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.avatarGuidList_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.entityIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.avatarGuidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerBuffChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getServerBuffChangeTypeValue() {
            return this.serverBuffChangeType_;
        }
        
        @Override
        public ServerBuffChangeType getServerBuffChangeType() {
            final ServerBuffChangeType result = ServerBuffChangeType.valueOf(this.serverBuffChangeType_);
            return (result == null) ? ServerBuffChangeType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean getIsCreatureBuff() {
            return this.isCreatureBuff_;
        }
        
        @Override
        public List<Integer> getEntityIdListList() {
            return this.entityIdList_;
        }
        
        @Override
        public int getEntityIdListCount() {
            return this.entityIdList_.size();
        }
        
        @Override
        public int getEntityIdList(final int index) {
            return this.entityIdList_.getInt(index);
        }
        
        @Override
        public List<Long> getAvatarGuidListList() {
            return this.avatarGuidList_;
        }
        
        @Override
        public int getAvatarGuidListCount() {
            return this.avatarGuidList_.size();
        }
        
        @Override
        public long getAvatarGuidList(final int index) {
            return this.avatarGuidList_.getLong(index);
        }
        
        @Override
        public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
            return this.serverBuffList_;
        }
        
        @Override
        public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
            return this.serverBuffList_;
        }
        
        @Override
        public int getServerBuffListCount() {
            return this.serverBuffList_.size();
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.getEntityIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.entityIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.entityIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.entityIdList_.getInt(i));
            }
            if (this.serverBuffChangeType_ != ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF.getNumber()) {
                output.writeEnum(7, this.serverBuffChangeType_);
            }
            if (this.isCreatureBuff_) {
                output.writeBool(10, this.isCreatureBuff_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(11, this.serverBuffList_.get(i));
            }
            if (this.getAvatarGuidListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.avatarGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.avatarGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.avatarGuidList_.getLong(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            int dataSize = 0;
            for (int i = 0; i < this.entityIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.entityIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getEntityIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.entityIdListMemoizedSerializedSize = dataSize;
            if (this.serverBuffChangeType_ != ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.serverBuffChangeType_);
            }
            if (this.isCreatureBuff_) {
                size += CodedOutputStream.computeBoolSize(10, this.isCreatureBuff_);
            }
            for (int j = 0; j < this.serverBuffList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(11, this.serverBuffList_.get(j));
            }
            dataSize = 0;
            for (int i = 0; i < this.avatarGuidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.avatarGuidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getAvatarGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.avatarGuidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerBuffChangeNotify)) {
                return super.equals(obj);
            }
            final ServerBuffChangeNotify other = (ServerBuffChangeNotify)obj;
            return this.serverBuffChangeType_ == other.serverBuffChangeType_ && this.getIsCreatureBuff() == other.getIsCreatureBuff() && this.getEntityIdListList().equals(other.getEntityIdListList()) && this.getAvatarGuidListList().equals(other.getAvatarGuidListList()) && this.getServerBuffListList().equals(other.getServerBuffListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.serverBuffChangeType_;
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsCreatureBuff());
            if (this.getEntityIdListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getEntityIdListList().hashCode();
            }
            if (this.getAvatarGuidListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getAvatarGuidListList().hashCode();
            }
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServerBuffChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerBuffChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuffChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerBuffChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuffChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ServerBuffChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerBuffChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerBuffChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuffChangeNotify.PARSER, input);
        }
        
        public static ServerBuffChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuffChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerBuffChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerBuffChangeNotify.PARSER, input);
        }
        
        public static ServerBuffChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerBuffChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerBuffChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuffChangeNotify.PARSER, input);
        }
        
        public static ServerBuffChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerBuffChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServerBuffChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServerBuffChangeNotify prototype) {
            return ServerBuffChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServerBuffChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServerBuffChangeNotify getDefaultInstance() {
            return ServerBuffChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServerBuffChangeNotify> parser() {
            return ServerBuffChangeNotify.PARSER;
        }
        
        @Override
        public Parser<ServerBuffChangeNotify> getParserForType() {
            return ServerBuffChangeNotify.PARSER;
        }
        
        @Override
        public ServerBuffChangeNotify getDefaultInstanceForType() {
            return ServerBuffChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServerBuffChangeNotify();
            PARSER = new AbstractParser<ServerBuffChangeNotify>() {
                @Override
                public ServerBuffChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServerBuffChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum ServerBuffChangeType implements ProtocolMessageEnum
        {
            SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF(0), 
            SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF(1), 
            UNRECOGNIZED(-1);
            
            public static final int SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF_VALUE = 0;
            public static final int SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF_VALUE = 1;
            private static final Internal.EnumLiteMap<ServerBuffChangeType> internalValueMap;
            private static final ServerBuffChangeType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == ServerBuffChangeType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static ServerBuffChangeType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ServerBuffChangeType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF;
                    }
                    case 1: {
                        return ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<ServerBuffChangeType> internalGetValueMap() {
                return ServerBuffChangeType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == ServerBuffChangeType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ServerBuffChangeNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static ServerBuffChangeType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return ServerBuffChangeType.UNRECOGNIZED;
                }
                return ServerBuffChangeType.VALUES[desc.getIndex()];
            }
            
            private ServerBuffChangeType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ ServerBuffChangeType[] value() {
                return new ServerBuffChangeType[] { ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_ADD_SERVER_BUFF, ServerBuffChangeType.SERVER_BUFF_CHANGE_TYPE_DEL_SERVER_BUFF, ServerBuffChangeType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<ServerBuffChangeType>() {
                    @Override
                    public ServerBuffChangeType findValueByNumber(final int number) {
                        return ServerBuffChangeType.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerBuffChangeNotifyOrBuilder
        {
            private int bitField0_;
            private int serverBuffChangeType_;
            private boolean isCreatureBuff_;
            private Internal.IntList entityIdList_;
            private Internal.LongList avatarGuidList_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerBuffChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.serverBuffChangeType_ = 0;
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.serverBuffChangeType_ = 0;
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServerBuffChangeNotify.alwaysUseFieldBuilders) {
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.serverBuffChangeType_ = 0;
                this.isCreatureBuff_ = false;
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServerBuffChangeNotifyOuterClass.internal_static_ServerBuffChangeNotify_descriptor;
            }
            
            @Override
            public ServerBuffChangeNotify getDefaultInstanceForType() {
                return ServerBuffChangeNotify.getDefaultInstance();
            }
            
            @Override
            public ServerBuffChangeNotify build() {
                final ServerBuffChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServerBuffChangeNotify buildPartial() {
                final ServerBuffChangeNotify result = new ServerBuffChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.serverBuffChangeType_ = this.serverBuffChangeType_;
                result.isCreatureBuff_ = this.isCreatureBuff_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.entityIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.entityIdList_ = this.entityIdList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.avatarGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.avatarGuidList_ = this.avatarGuidList_;
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof ServerBuffChangeNotify) {
                    return this.mergeFrom((ServerBuffChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServerBuffChangeNotify other) {
                if (other == ServerBuffChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.serverBuffChangeType_ != 0) {
                    this.setServerBuffChangeTypeValue(other.getServerBuffChangeTypeValue());
                }
                if (other.getIsCreatureBuff()) {
                    this.setIsCreatureBuff(other.getIsCreatureBuff());
                }
                if (!other.entityIdList_.isEmpty()) {
                    if (this.entityIdList_.isEmpty()) {
                        this.entityIdList_ = other.entityIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureEntityIdListIsMutable();
                        this.entityIdList_.addAll(other.entityIdList_);
                    }
                    this.onChanged();
                }
                if (!other.avatarGuidList_.isEmpty()) {
                    if (this.avatarGuidList_.isEmpty()) {
                        this.avatarGuidList_ = other.avatarGuidList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureAvatarGuidListIsMutable();
                        this.avatarGuidList_.addAll(other.avatarGuidList_);
                    }
                    this.onChanged();
                }
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureServerBuffListIsMutable();
                            this.serverBuffList_.addAll(other.serverBuffList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.serverBuffList_.isEmpty()) {
                    if (this.serverBuffListBuilder_.isEmpty()) {
                        this.serverBuffListBuilder_.dispose();
                        this.serverBuffListBuilder_ = null;
                        this.serverBuffList_ = other.serverBuffList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.serverBuffListBuilder_ = (ServerBuffChangeNotify.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                ServerBuffChangeNotify parsedMessage = null;
                try {
                    parsedMessage = ServerBuffChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServerBuffChangeNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getServerBuffChangeTypeValue() {
                return this.serverBuffChangeType_;
            }
            
            public Builder setServerBuffChangeTypeValue(final int value) {
                this.serverBuffChangeType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ServerBuffChangeType getServerBuffChangeType() {
                final ServerBuffChangeType result = ServerBuffChangeType.valueOf(this.serverBuffChangeType_);
                return (result == null) ? ServerBuffChangeType.UNRECOGNIZED : result;
            }
            
            public Builder setServerBuffChangeType(final ServerBuffChangeType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.serverBuffChangeType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearServerBuffChangeType() {
                this.serverBuffChangeType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsCreatureBuff() {
                return this.isCreatureBuff_;
            }
            
            public Builder setIsCreatureBuff(final boolean value) {
                this.isCreatureBuff_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsCreatureBuff() {
                this.isCreatureBuff_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureEntityIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.entityIdList_ = GeneratedMessageV3.mutableCopy(this.entityIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getEntityIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.entityIdList_) : this.entityIdList_;
            }
            
            @Override
            public int getEntityIdListCount() {
                return this.entityIdList_.size();
            }
            
            @Override
            public int getEntityIdList(final int index) {
                return this.entityIdList_.getInt(index);
            }
            
            public Builder setEntityIdList(final int index, final int value) {
                this.ensureEntityIdListIsMutable();
                this.entityIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addEntityIdList(final int value) {
                this.ensureEntityIdListIsMutable();
                this.entityIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllEntityIdList(final Iterable<? extends Integer> values) {
                this.ensureEntityIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.entityIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityIdList() {
                this.entityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureAvatarGuidListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.avatarGuidList_ = GeneratedMessageV3.mutableCopy(this.avatarGuidList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Long> getAvatarGuidListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.avatarGuidList_) : this.avatarGuidList_;
            }
            
            @Override
            public int getAvatarGuidListCount() {
                return this.avatarGuidList_.size();
            }
            
            @Override
            public long getAvatarGuidList(final int index) {
                return this.avatarGuidList_.getLong(index);
            }
            
            public Builder setAvatarGuidList(final int index, final long value) {
                this.ensureAvatarGuidListIsMutable();
                this.avatarGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAvatarGuidList(final long value) {
                this.ensureAvatarGuidListIsMutable();
                this.avatarGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAvatarGuidList(final Iterable<? extends Long> values) {
                this.ensureAvatarGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.avatarGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuidList() {
                this.avatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
                if (this.serverBuffListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                return this.serverBuffListBuilder_.getMessageList();
            }
            
            @Override
            public int getServerBuffListCount() {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.size();
                }
                return this.serverBuffListBuilder_.getCount();
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessage(index);
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllServerBuffList(final Iterable<? extends ServerBuffOuterClass.ServerBuff> values) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.serverBuffList_);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearServerBuffList() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.remove(index);
                }
                return this;
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder getServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
                if (this.serverBuffListBuilder_ != null) {
                    return this.serverBuffListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuffOrBuilder>)this.serverBuffList_);
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder() {
                return this.getServerBuffListFieldBuilder().addBuilder(ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().addBuilder(index, ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public List<ServerBuffOuterClass.ServerBuff.Builder> getServerBuffListBuilderList() {
                return this.getServerBuffListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListFieldBuilder() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ServerBuffChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getServerBuffChangeTypeValue();
        
        ServerBuffChangeNotify.ServerBuffChangeType getServerBuffChangeType();
        
        boolean getIsCreatureBuff();
        
        List<Integer> getEntityIdListList();
        
        int getEntityIdListCount();
        
        int getEntityIdList(final int p0);
        
        List<Long> getAvatarGuidListList();
        
        int getAvatarGuidListCount();
        
        long getAvatarGuidList(final int p0);
        
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
    }
}
