// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EntityConfigHashEntryOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityConfigHashEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityConfigHashEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityConfigHashEntryOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityConfigHashEntryOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bEntityConfigHashEntry.proto\"N\n\u0015EntityConfigHashEntry\u0012\u000e\n\u0006job_id\u0018\b \u0001(\r\u0012\u0012\n\nhash_value\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tentity_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityConfigHashEntryOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EntityConfigHashEntry_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityConfigHashEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor, new String[] { "JobId", "HashValue", "EntityId" });
    }
    
    public static final class EntityConfigHashEntry extends GeneratedMessageV3 implements EntityConfigHashEntryOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int JOB_ID_FIELD_NUMBER = 8;
        private int jobId_;
        public static final int HASH_VALUE_FIELD_NUMBER = 6;
        private int hashValue_;
        public static final int ENTITY_ID_FIELD_NUMBER = 11;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final EntityConfigHashEntry DEFAULT_INSTANCE;
        private static final Parser<EntityConfigHashEntry> PARSER;
        
        private EntityConfigHashEntry(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityConfigHashEntry() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityConfigHashEntry();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityConfigHashEntry(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 48: {
                            this.hashValue_ = input.readInt32();
                            continue;
                        }
                        case 64: {
                            this.jobId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.entityId_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityConfigHashEntry.class, Builder.class);
        }
        
        @Override
        public int getJobId() {
            return this.jobId_;
        }
        
        @Override
        public int getHashValue() {
            return this.hashValue_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
            if (this.hashValue_ != 0) {
                output.writeInt32(6, this.hashValue_);
            }
            if (this.jobId_ != 0) {
                output.writeUInt32(8, this.jobId_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(11, this.entityId_);
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
            if (this.hashValue_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.hashValue_);
            }
            if (this.jobId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.jobId_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityConfigHashEntry)) {
                return super.equals(obj);
            }
            final EntityConfigHashEntry other = (EntityConfigHashEntry)obj;
            return this.getJobId() == other.getJobId() && this.getHashValue() == other.getHashValue() && this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getJobId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getHashValue();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityConfigHashEntry parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data);
        }
        
        public static EntityConfigHashEntry parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityConfigHashEntry parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data);
        }
        
        public static EntityConfigHashEntry parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityConfigHashEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data);
        }
        
        public static EntityConfigHashEntry parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityConfigHashEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityConfigHashEntry parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityConfigHashEntry.PARSER, input);
        }
        
        public static EntityConfigHashEntry parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityConfigHashEntry.PARSER, input, extensionRegistry);
        }
        
        public static EntityConfigHashEntry parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityConfigHashEntry.PARSER, input);
        }
        
        public static EntityConfigHashEntry parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityConfigHashEntry.PARSER, input, extensionRegistry);
        }
        
        public static EntityConfigHashEntry parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityConfigHashEntry.PARSER, input);
        }
        
        public static EntityConfigHashEntry parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityConfigHashEntry.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityConfigHashEntry.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityConfigHashEntry prototype) {
            return EntityConfigHashEntry.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityConfigHashEntry.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityConfigHashEntry getDefaultInstance() {
            return EntityConfigHashEntry.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityConfigHashEntry> parser() {
            return EntityConfigHashEntry.PARSER;
        }
        
        @Override
        public Parser<EntityConfigHashEntry> getParserForType() {
            return EntityConfigHashEntry.PARSER;
        }
        
        @Override
        public EntityConfigHashEntry getDefaultInstanceForType() {
            return EntityConfigHashEntry.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityConfigHashEntry();
            PARSER = new AbstractParser<EntityConfigHashEntry>() {
                @Override
                public EntityConfigHashEntry parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityConfigHashEntry(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityConfigHashEntryOrBuilder
        {
            private int jobId_;
            private int hashValue_;
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityConfigHashEntry.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityConfigHashEntry.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.jobId_ = 0;
                this.hashValue_ = 0;
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityConfigHashEntryOuterClass.internal_static_EntityConfigHashEntry_descriptor;
            }
            
            @Override
            public EntityConfigHashEntry getDefaultInstanceForType() {
                return EntityConfigHashEntry.getDefaultInstance();
            }
            
            @Override
            public EntityConfigHashEntry build() {
                final EntityConfigHashEntry result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityConfigHashEntry buildPartial() {
                final EntityConfigHashEntry result = new EntityConfigHashEntry(this);
                result.jobId_ = this.jobId_;
                result.hashValue_ = this.hashValue_;
                result.entityId_ = this.entityId_;
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
                if (other instanceof EntityConfigHashEntry) {
                    return this.mergeFrom((EntityConfigHashEntry)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityConfigHashEntry other) {
                if (other == EntityConfigHashEntry.getDefaultInstance()) {
                    return this;
                }
                if (other.getJobId() != 0) {
                    this.setJobId(other.getJobId());
                }
                if (other.getHashValue() != 0) {
                    this.setHashValue(other.getHashValue());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                EntityConfigHashEntry parsedMessage = null;
                try {
                    parsedMessage = EntityConfigHashEntry.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityConfigHashEntry)e.getUnfinishedMessage();
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
            public int getJobId() {
                return this.jobId_;
            }
            
            public Builder setJobId(final int value) {
                this.jobId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearJobId() {
                this.jobId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHashValue() {
                return this.hashValue_;
            }
            
            public Builder setHashValue(final int value) {
                this.hashValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHashValue() {
                this.hashValue_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EntityConfigHashEntryOrBuilder extends MessageOrBuilder
    {
        int getJobId();
        
        int getHashValue();
        
        int getEntityId();
    }
}
