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

public final class ProudSkillChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ProudSkillChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ProudSkillChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ProudSkillChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ProudSkillChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cProudSkillChangeNotify.proto\"r\n\u0016ProudSkillChangeNotify\u0012\u0013\n\u000bavatar_guid\u0018\u000b \u0001(\u0004\u0012\u0011\n\tentity_id\u0018\u0004 \u0001(\r\u0012\u0016\n\u000eskill_depot_id\u0018\b \u0001(\r\u0012\u0018\n\u0010proud_skill_list\u0018\f \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ProudSkillChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ProudSkillChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ProudSkillChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor, new String[] { "AvatarGuid", "EntityId", "SkillDepotId", "ProudSkillList" });
    }
    
    public static final class ProudSkillChangeNotify extends GeneratedMessageV3 implements ProudSkillChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_GUID_FIELD_NUMBER = 11;
        private long avatarGuid_;
        public static final int ENTITY_ID_FIELD_NUMBER = 4;
        private int entityId_;
        public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 8;
        private int skillDepotId_;
        public static final int PROUD_SKILL_LIST_FIELD_NUMBER = 12;
        private Internal.IntList proudSkillList_;
        private int proudSkillListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ProudSkillChangeNotify DEFAULT_INSTANCE;
        private static final Parser<ProudSkillChangeNotify> PARSER;
        
        private ProudSkillChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.proudSkillListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ProudSkillChangeNotify() {
            this.proudSkillListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.proudSkillList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ProudSkillChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ProudSkillChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.skillDepotId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.proudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.proudSkillList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.proudSkillList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.proudSkillList_.addInt(input.readUInt32());
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
                    this.proudSkillList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ProudSkillChangeNotify.class, Builder.class);
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getSkillDepotId() {
            return this.skillDepotId_;
        }
        
        @Override
        public List<Integer> getProudSkillListList() {
            return this.proudSkillList_;
        }
        
        @Override
        public int getProudSkillListCount() {
            return this.proudSkillList_.size();
        }
        
        @Override
        public int getProudSkillList(final int index) {
            return this.proudSkillList_.getInt(index);
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
            if (this.entityId_ != 0) {
                output.writeUInt32(4, this.entityId_);
            }
            if (this.skillDepotId_ != 0) {
                output.writeUInt32(8, this.skillDepotId_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(11, this.avatarGuid_);
            }
            if (this.getProudSkillListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.proudSkillListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.proudSkillList_.size(); ++i) {
                output.writeUInt32NoTag(this.proudSkillList_.getInt(i));
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.entityId_);
            }
            if (this.skillDepotId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.skillDepotId_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(11, this.avatarGuid_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.proudSkillList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.proudSkillList_.getInt(i));
            }
            size += dataSize;
            if (!this.getProudSkillListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.proudSkillListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProudSkillChangeNotify)) {
                return super.equals(obj);
            }
            final ProudSkillChangeNotify other = (ProudSkillChangeNotify)obj;
            return this.getAvatarGuid() == other.getAvatarGuid() && this.getEntityId() == other.getEntityId() && this.getSkillDepotId() == other.getSkillDepotId() && this.getProudSkillListList().equals(other.getProudSkillListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSkillDepotId();
            if (this.getProudSkillListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getProudSkillListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ProudSkillChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ProudSkillChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ProudSkillChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ProudSkillChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ProudSkillChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data);
        }
        
        public static ProudSkillChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ProudSkillChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ProudSkillChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ProudSkillChangeNotify.PARSER, input);
        }
        
        public static ProudSkillChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ProudSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ProudSkillChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ProudSkillChangeNotify.PARSER, input);
        }
        
        public static ProudSkillChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ProudSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static ProudSkillChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ProudSkillChangeNotify.PARSER, input);
        }
        
        public static ProudSkillChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ProudSkillChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ProudSkillChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ProudSkillChangeNotify prototype) {
            return ProudSkillChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ProudSkillChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ProudSkillChangeNotify getDefaultInstance() {
            return ProudSkillChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ProudSkillChangeNotify> parser() {
            return ProudSkillChangeNotify.PARSER;
        }
        
        @Override
        public Parser<ProudSkillChangeNotify> getParserForType() {
            return ProudSkillChangeNotify.PARSER;
        }
        
        @Override
        public ProudSkillChangeNotify getDefaultInstanceForType() {
            return ProudSkillChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ProudSkillChangeNotify();
            PARSER = new AbstractParser<ProudSkillChangeNotify>() {
                @Override
                public ProudSkillChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ProudSkillChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ProudSkillChangeNotifyOrBuilder
        {
            private int bitField0_;
            private long avatarGuid_;
            private int entityId_;
            private int skillDepotId_;
            private Internal.IntList proudSkillList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ProudSkillChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.proudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.proudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ProudSkillChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.avatarGuid_ = 0L;
                this.entityId_ = 0;
                this.skillDepotId_ = 0;
                this.proudSkillList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
            }
            
            @Override
            public ProudSkillChangeNotify getDefaultInstanceForType() {
                return ProudSkillChangeNotify.getDefaultInstance();
            }
            
            @Override
            public ProudSkillChangeNotify build() {
                final ProudSkillChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ProudSkillChangeNotify buildPartial() {
                final ProudSkillChangeNotify result = new ProudSkillChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.avatarGuid_ = this.avatarGuid_;
                result.entityId_ = this.entityId_;
                result.skillDepotId_ = this.skillDepotId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.proudSkillList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.proudSkillList_ = this.proudSkillList_;
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
                if (other instanceof ProudSkillChangeNotify) {
                    return this.mergeFrom((ProudSkillChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ProudSkillChangeNotify other) {
                if (other == ProudSkillChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getSkillDepotId() != 0) {
                    this.setSkillDepotId(other.getSkillDepotId());
                }
                if (!other.proudSkillList_.isEmpty()) {
                    if (this.proudSkillList_.isEmpty()) {
                        this.proudSkillList_ = other.proudSkillList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureProudSkillListIsMutable();
                        this.proudSkillList_.addAll(other.proudSkillList_);
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
                ProudSkillChangeNotify parsedMessage = null;
                try {
                    parsedMessage = ProudSkillChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ProudSkillChangeNotify)e.getUnfinishedMessage();
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
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSkillDepotId() {
                return this.skillDepotId_;
            }
            
            public Builder setSkillDepotId(final int value) {
                this.skillDepotId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSkillDepotId() {
                this.skillDepotId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureProudSkillListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.proudSkillList_ = GeneratedMessageV3.mutableCopy(this.proudSkillList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getProudSkillListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.proudSkillList_) : this.proudSkillList_;
            }
            
            @Override
            public int getProudSkillListCount() {
                return this.proudSkillList_.size();
            }
            
            @Override
            public int getProudSkillList(final int index) {
                return this.proudSkillList_.getInt(index);
            }
            
            public Builder setProudSkillList(final int index, final int value) {
                this.ensureProudSkillListIsMutable();
                this.proudSkillList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addProudSkillList(final int value) {
                this.ensureProudSkillListIsMutable();
                this.proudSkillList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllProudSkillList(final Iterable<? extends Integer> values) {
                this.ensureProudSkillListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.proudSkillList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearProudSkillList() {
                this.proudSkillList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface ProudSkillChangeNotifyOrBuilder extends MessageOrBuilder
    {
        long getAvatarGuid();
        
        int getEntityId();
        
        int getSkillDepotId();
        
        List<Integer> getProudSkillListList();
        
        int getProudSkillListCount();
        
        int getProudSkillList(final int p0);
    }
}
