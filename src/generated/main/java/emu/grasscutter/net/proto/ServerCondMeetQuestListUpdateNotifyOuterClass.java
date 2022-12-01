// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ServerCondMeetQuestListUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ServerCondMeetQuestListUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ServerCondMeetQuestListUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n)ServerCondMeetQuestListUpdateNotify.proto\"[\n#ServerCondMeetQuestListUpdateNotify\u0012\u0019\n\u0011del_quest_id_list\u0018\u0001 \u0003(\r\u0012\u0019\n\u0011add_quest_id_list\u0018\f \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ServerCondMeetQuestListUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ServerCondMeetQuestListUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor, new String[] { "DelQuestIdList", "AddQuestIdList" });
    }
    
    public static final class ServerCondMeetQuestListUpdateNotify extends GeneratedMessageV3 implements ServerCondMeetQuestListUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEL_QUEST_ID_LIST_FIELD_NUMBER = 1;
        private Internal.IntList delQuestIdList_;
        private int delQuestIdListMemoizedSerializedSize;
        public static final int ADD_QUEST_ID_LIST_FIELD_NUMBER = 12;
        private Internal.IntList addQuestIdList_;
        private int addQuestIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ServerCondMeetQuestListUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<ServerCondMeetQuestListUpdateNotify> PARSER;
        
        private ServerCondMeetQuestListUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.delQuestIdListMemoizedSerializedSize = -1;
            this.addQuestIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ServerCondMeetQuestListUpdateNotify() {
            this.delQuestIdListMemoizedSerializedSize = -1;
            this.addQuestIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.delQuestIdList_ = GeneratedMessageV3.emptyIntList();
            this.addQuestIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ServerCondMeetQuestListUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ServerCondMeetQuestListUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.delQuestIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.delQuestIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.delQuestIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.delQuestIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.addQuestIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.addQuestIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.addQuestIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.addQuestIdList_.addInt(input.readUInt32());
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
                    this.delQuestIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.addQuestIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerCondMeetQuestListUpdateNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getDelQuestIdListList() {
            return this.delQuestIdList_;
        }
        
        @Override
        public int getDelQuestIdListCount() {
            return this.delQuestIdList_.size();
        }
        
        @Override
        public int getDelQuestIdList(final int index) {
            return this.delQuestIdList_.getInt(index);
        }
        
        @Override
        public List<Integer> getAddQuestIdListList() {
            return this.addQuestIdList_;
        }
        
        @Override
        public int getAddQuestIdListCount() {
            return this.addQuestIdList_.size();
        }
        
        @Override
        public int getAddQuestIdList(final int index) {
            return this.addQuestIdList_.getInt(index);
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
            if (this.getDelQuestIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.delQuestIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.delQuestIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.delQuestIdList_.getInt(i));
            }
            if (this.getAddQuestIdListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.addQuestIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.addQuestIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.addQuestIdList_.getInt(i));
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
            for (int i = 0; i < this.delQuestIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.delQuestIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDelQuestIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.delQuestIdListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.addQuestIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.addQuestIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getAddQuestIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.addQuestIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerCondMeetQuestListUpdateNotify)) {
                return super.equals(obj);
            }
            final ServerCondMeetQuestListUpdateNotify other = (ServerCondMeetQuestListUpdateNotify)obj;
            return this.getDelQuestIdListList().equals(other.getDelQuestIdListList()) && this.getAddQuestIdListList().equals(other.getAddQuestIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDelQuestIdListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getDelQuestIdListList().hashCode();
            }
            if (this.getAddQuestIdListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getAddQuestIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ServerCondMeetQuestListUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input);
        }
        
        public static ServerCondMeetQuestListUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ServerCondMeetQuestListUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ServerCondMeetQuestListUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ServerCondMeetQuestListUpdateNotify prototype) {
            return ServerCondMeetQuestListUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ServerCondMeetQuestListUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ServerCondMeetQuestListUpdateNotify getDefaultInstance() {
            return ServerCondMeetQuestListUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ServerCondMeetQuestListUpdateNotify> parser() {
            return ServerCondMeetQuestListUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<ServerCondMeetQuestListUpdateNotify> getParserForType() {
            return ServerCondMeetQuestListUpdateNotify.PARSER;
        }
        
        @Override
        public ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
            return ServerCondMeetQuestListUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ServerCondMeetQuestListUpdateNotify();
            PARSER = new AbstractParser<ServerCondMeetQuestListUpdateNotify>() {
                @Override
                public ServerCondMeetQuestListUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ServerCondMeetQuestListUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerCondMeetQuestListUpdateNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList delQuestIdList_;
            private Internal.IntList addQuestIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerCondMeetQuestListUpdateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.delQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.addQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.delQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.addQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ServerCondMeetQuestListUpdateNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.delQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.addQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
            }
            
            @Override
            public ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
                return ServerCondMeetQuestListUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public ServerCondMeetQuestListUpdateNotify build() {
                final ServerCondMeetQuestListUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ServerCondMeetQuestListUpdateNotify buildPartial() {
                final ServerCondMeetQuestListUpdateNotify result = new ServerCondMeetQuestListUpdateNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.delQuestIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.delQuestIdList_ = this.delQuestIdList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.addQuestIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.addQuestIdList_ = this.addQuestIdList_;
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
                if (other instanceof ServerCondMeetQuestListUpdateNotify) {
                    return this.mergeFrom((ServerCondMeetQuestListUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ServerCondMeetQuestListUpdateNotify other) {
                if (other == ServerCondMeetQuestListUpdateNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.delQuestIdList_.isEmpty()) {
                    if (this.delQuestIdList_.isEmpty()) {
                        this.delQuestIdList_ = other.delQuestIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureDelQuestIdListIsMutable();
                        this.delQuestIdList_.addAll(other.delQuestIdList_);
                    }
                    this.onChanged();
                }
                if (!other.addQuestIdList_.isEmpty()) {
                    if (this.addQuestIdList_.isEmpty()) {
                        this.addQuestIdList_ = other.addQuestIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureAddQuestIdListIsMutable();
                        this.addQuestIdList_.addAll(other.addQuestIdList_);
                    }
                    this.onChanged();
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
                ServerCondMeetQuestListUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = ServerCondMeetQuestListUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ServerCondMeetQuestListUpdateNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureDelQuestIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.delQuestIdList_ = GeneratedMessageV3.mutableCopy(this.delQuestIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getDelQuestIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.delQuestIdList_) : this.delQuestIdList_;
            }
            
            @Override
            public int getDelQuestIdListCount() {
                return this.delQuestIdList_.size();
            }
            
            @Override
            public int getDelQuestIdList(final int index) {
                return this.delQuestIdList_.getInt(index);
            }
            
            public Builder setDelQuestIdList(final int index, final int value) {
                this.ensureDelQuestIdListIsMutable();
                this.delQuestIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDelQuestIdList(final int value) {
                this.ensureDelQuestIdListIsMutable();
                this.delQuestIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDelQuestIdList(final Iterable<? extends Integer> values) {
                this.ensureDelQuestIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.delQuestIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDelQuestIdList() {
                this.delQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureAddQuestIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.addQuestIdList_ = GeneratedMessageV3.mutableCopy(this.addQuestIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getAddQuestIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.addQuestIdList_) : this.addQuestIdList_;
            }
            
            @Override
            public int getAddQuestIdListCount() {
                return this.addQuestIdList_.size();
            }
            
            @Override
            public int getAddQuestIdList(final int index) {
                return this.addQuestIdList_.getInt(index);
            }
            
            public Builder setAddQuestIdList(final int index, final int value) {
                this.ensureAddQuestIdListIsMutable();
                this.addQuestIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAddQuestIdList(final int value) {
                this.ensureAddQuestIdListIsMutable();
                this.addQuestIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAddQuestIdList(final Iterable<? extends Integer> values) {
                this.ensureAddQuestIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.addQuestIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAddQuestIdList() {
                this.addQuestIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
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
    
    public interface ServerCondMeetQuestListUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getDelQuestIdListList();
        
        int getDelQuestIdListCount();
        
        int getDelQuestIdList(final int p0);
        
        List<Integer> getAddQuestIdListList();
        
        int getAddQuestIdListCount();
        
        int getAddQuestIdList(final int p0);
    }
}
