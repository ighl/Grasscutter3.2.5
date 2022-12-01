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

public final class GroupUnloadNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_GroupUnloadNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GroupUnloadNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GroupUnloadNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GroupUnloadNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017GroupUnloadNotify.proto\"'\n\u0011GroupUnloadNotify\u0012\u0012\n\ngroup_list\u0018\n \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GroupUnloadNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GroupUnloadNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GroupUnloadNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_descriptor, new String[] { "GroupList" });
    }
    
    public static final class GroupUnloadNotify extends GeneratedMessageV3 implements GroupUnloadNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GROUP_LIST_FIELD_NUMBER = 10;
        private Internal.IntList groupList_;
        private int groupListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final GroupUnloadNotify DEFAULT_INSTANCE;
        private static final Parser<GroupUnloadNotify> PARSER;
        
        private GroupUnloadNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.groupListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GroupUnloadNotify() {
            this.groupListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.groupList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GroupUnloadNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GroupUnloadNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.groupList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.groupList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.groupList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.groupList_.addInt(input.readUInt32());
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
                    this.groupList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupUnloadNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getGroupListList() {
            return this.groupList_;
        }
        
        @Override
        public int getGroupListCount() {
            return this.groupList_.size();
        }
        
        @Override
        public int getGroupList(final int index) {
            return this.groupList_.getInt(index);
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
            if (this.getGroupListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.groupListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.groupList_.size(); ++i) {
                output.writeUInt32NoTag(this.groupList_.getInt(i));
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
            for (int i = 0; i < this.groupList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.groupList_.getInt(i));
            }
            size += dataSize;
            if (!this.getGroupListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.groupListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupUnloadNotify)) {
                return super.equals(obj);
            }
            final GroupUnloadNotify other = (GroupUnloadNotify)obj;
            return this.getGroupListList().equals(other.getGroupListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getGroupListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getGroupListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GroupUnloadNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data);
        }
        
        public static GroupUnloadNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupUnloadNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data);
        }
        
        public static GroupUnloadNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupUnloadNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data);
        }
        
        public static GroupUnloadNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GroupUnloadNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GroupUnloadNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupUnloadNotify.PARSER, input);
        }
        
        public static GroupUnloadNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupUnloadNotify.PARSER, input, extensionRegistry);
        }
        
        public static GroupUnloadNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GroupUnloadNotify.PARSER, input);
        }
        
        public static GroupUnloadNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GroupUnloadNotify.PARSER, input, extensionRegistry);
        }
        
        public static GroupUnloadNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupUnloadNotify.PARSER, input);
        }
        
        public static GroupUnloadNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GroupUnloadNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GroupUnloadNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GroupUnloadNotify prototype) {
            return GroupUnloadNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GroupUnloadNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GroupUnloadNotify getDefaultInstance() {
            return GroupUnloadNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<GroupUnloadNotify> parser() {
            return GroupUnloadNotify.PARSER;
        }
        
        @Override
        public Parser<GroupUnloadNotify> getParserForType() {
            return GroupUnloadNotify.PARSER;
        }
        
        @Override
        public GroupUnloadNotify getDefaultInstanceForType() {
            return GroupUnloadNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GroupUnloadNotify();
            PARSER = new AbstractParser<GroupUnloadNotify>() {
                @Override
                public GroupUnloadNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GroupUnloadNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupUnloadNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList groupList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupUnloadNotify.class, Builder.class);
            }
            
            private Builder() {
                this.groupList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.groupList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GroupUnloadNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.groupList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GroupUnloadNotifyOuterClass.internal_static_GroupUnloadNotify_descriptor;
            }
            
            @Override
            public GroupUnloadNotify getDefaultInstanceForType() {
                return GroupUnloadNotify.getDefaultInstance();
            }
            
            @Override
            public GroupUnloadNotify build() {
                final GroupUnloadNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GroupUnloadNotify buildPartial() {
                final GroupUnloadNotify result = new GroupUnloadNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.groupList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.groupList_ = this.groupList_;
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
                if (other instanceof GroupUnloadNotify) {
                    return this.mergeFrom((GroupUnloadNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GroupUnloadNotify other) {
                if (other == GroupUnloadNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.groupList_.isEmpty()) {
                    if (this.groupList_.isEmpty()) {
                        this.groupList_ = other.groupList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureGroupListIsMutable();
                        this.groupList_.addAll(other.groupList_);
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
                GroupUnloadNotify parsedMessage = null;
                try {
                    parsedMessage = GroupUnloadNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GroupUnloadNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureGroupListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.groupList_ = GeneratedMessageV3.mutableCopy(this.groupList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getGroupListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.groupList_) : this.groupList_;
            }
            
            @Override
            public int getGroupListCount() {
                return this.groupList_.size();
            }
            
            @Override
            public int getGroupList(final int index) {
                return this.groupList_.getInt(index);
            }
            
            public Builder setGroupList(final int index, final int value) {
                this.ensureGroupListIsMutable();
                this.groupList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addGroupList(final int value) {
                this.ensureGroupListIsMutable();
                this.groupList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllGroupList(final Iterable<? extends Integer> values) {
                this.ensureGroupListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.groupList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupList() {
                this.groupList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface GroupUnloadNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getGroupListList();
        
        int getGroupListCount();
        
        int getGroupList(final int p0);
    }
}
