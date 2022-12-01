// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class FireworkSetDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireworkSetData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireworkSetData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireworkSetDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireworkSetDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015FireworkSetData.proto\u001a\u0016FireWorkInstance.proto\"c\n\u000fFireworkSetData\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\u0017\n\u000f_unknown_field_\u0018\u0002 \u0003(\r\u0012+\n\u0010fireWorkInstance\u0018\u0003 \u0003(\u000b2\u0011.FireWorkInstanceB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireworkSetDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireWorkInstanceOuterClass.getDescriptor() });
        internal_static_FireworkSetData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireworkSetData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireworkSetDataOuterClass.internal_static_FireworkSetData_descriptor, new String[] { "Id", "UnknownField", "FireWorkInstance" });
        FireWorkInstanceOuterClass.getDescriptor();
    }
    
    public static final class FireworkSetData extends GeneratedMessageV3 implements FireworkSetDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        public static final int _UNKNOWN_FIELD__FIELD_NUMBER = 2;
        private Internal.IntList UnknownField_;
        private int UnknownFieldMemoizedSerializedSize;
        public static final int FIREWORKINSTANCE_FIELD_NUMBER = 3;
        private List<FireWorkInstanceOuterClass.FireWorkInstance> fireWorkInstance_;
        private byte memoizedIsInitialized;
        private static final FireworkSetData DEFAULT_INSTANCE;
        private static final Parser<FireworkSetData> PARSER;
        
        private FireworkSetData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.UnknownFieldMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private FireworkSetData() {
            this.UnknownFieldMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.UnknownField_ = GeneratedMessageV3.emptyIntList();
            this.fireWorkInstance_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireworkSetData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireworkSetData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.id_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.UnknownField_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.UnknownField_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.UnknownField_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.UnknownField_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.fireWorkInstance_ = new ArrayList<FireWorkInstanceOuterClass.FireWorkInstance>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.fireWorkInstance_.add(input.readMessage(FireWorkInstanceOuterClass.FireWorkInstance.parser(), extensionRegistry));
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
                    this.UnknownField_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.fireWorkInstance_ = Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstance>)this.fireWorkInstance_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FireworkSetDataOuterClass.internal_static_FireworkSetData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireworkSetDataOuterClass.internal_static_FireworkSetData_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetData.class, Builder.class);
        }
        
        @Override
        public int getId() {
            return this.id_;
        }
        
        @Override
        public List<Integer> getUnknownFieldList() {
            return this.UnknownField_;
        }
        
        @Override
        public int getUnknownFieldCount() {
            return this.UnknownField_.size();
        }
        
        @Override
        public int getUnknownField(final int index) {
            return this.UnknownField_.getInt(index);
        }
        
        @Override
        public List<FireWorkInstanceOuterClass.FireWorkInstance> getFireWorkInstanceList() {
            return this.fireWorkInstance_;
        }
        
        @Override
        public List<? extends FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> getFireWorkInstanceOrBuilderList() {
            return this.fireWorkInstance_;
        }
        
        @Override
        public int getFireWorkInstanceCount() {
            return this.fireWorkInstance_.size();
        }
        
        @Override
        public FireWorkInstanceOuterClass.FireWorkInstance getFireWorkInstance(final int index) {
            return this.fireWorkInstance_.get(index);
        }
        
        @Override
        public FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder getFireWorkInstanceOrBuilder(final int index) {
            return this.fireWorkInstance_.get(index);
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
            if (this.id_ != 0) {
                output.writeUInt32(1, this.id_);
            }
            if (this.getUnknownFieldList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.UnknownFieldMemoizedSerializedSize);
            }
            for (int i = 0; i < this.UnknownField_.size(); ++i) {
                output.writeUInt32NoTag(this.UnknownField_.getInt(i));
            }
            for (int i = 0; i < this.fireWorkInstance_.size(); ++i) {
                output.writeMessage(3, this.fireWorkInstance_.get(i));
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
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.id_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.UnknownField_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.UnknownField_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnknownFieldList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.UnknownFieldMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.fireWorkInstance_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(3, this.fireWorkInstance_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireworkSetData)) {
                return super.equals(obj);
            }
            final FireworkSetData other = (FireworkSetData)obj;
            return this.getId() == other.getId() && this.getUnknownFieldList().equals(other.getUnknownFieldList()) && this.getFireWorkInstanceList().equals(other.getFireWorkInstanceList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getId();
            if (this.getUnknownFieldCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getUnknownFieldList().hashCode();
            }
            if (this.getFireWorkInstanceCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getFireWorkInstanceList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireworkSetData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data);
        }
        
        public static FireworkSetData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data);
        }
        
        public static FireworkSetData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data);
        }
        
        public static FireworkSetData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireworkSetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireworkSetData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetData.PARSER, input);
        }
        
        public static FireworkSetData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetData.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetData.PARSER, input);
        }
        
        public static FireworkSetData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireworkSetData.PARSER, input, extensionRegistry);
        }
        
        public static FireworkSetData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetData.PARSER, input);
        }
        
        public static FireworkSetData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireworkSetData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireworkSetData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireworkSetData prototype) {
            return FireworkSetData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireworkSetData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireworkSetData getDefaultInstance() {
            return FireworkSetData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireworkSetData> parser() {
            return FireworkSetData.PARSER;
        }
        
        @Override
        public Parser<FireworkSetData> getParserForType() {
            return FireworkSetData.PARSER;
        }
        
        @Override
        public FireworkSetData getDefaultInstanceForType() {
            return FireworkSetData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireworkSetData();
            PARSER = new AbstractParser<FireworkSetData>() {
                @Override
                public FireworkSetData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireworkSetData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireworkSetDataOrBuilder
        {
            private int bitField0_;
            private int id_;
            private Internal.IntList UnknownField_;
            private List<FireWorkInstanceOuterClass.FireWorkInstance> fireWorkInstance_;
            private RepeatedFieldBuilderV3<FireWorkInstanceOuterClass.FireWorkInstance, FireWorkInstanceOuterClass.FireWorkInstance.Builder, FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> fireWorkInstanceBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireworkSetDataOuterClass.internal_static_FireworkSetData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireworkSetDataOuterClass.internal_static_FireworkSetData_fieldAccessorTable.ensureFieldAccessorsInitialized(FireworkSetData.class, Builder.class);
            }
            
            private Builder() {
                this.UnknownField_ = GeneratedMessageV3.emptyIntList();
                this.fireWorkInstance_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.UnknownField_ = GeneratedMessageV3.emptyIntList();
                this.fireWorkInstance_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireworkSetData.alwaysUseFieldBuilders) {
                    this.getFireWorkInstanceFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.id_ = 0;
                this.UnknownField_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.fireWorkInstance_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.fireWorkInstanceBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireworkSetDataOuterClass.internal_static_FireworkSetData_descriptor;
            }
            
            @Override
            public FireworkSetData getDefaultInstanceForType() {
                return FireworkSetData.getDefaultInstance();
            }
            
            @Override
            public FireworkSetData build() {
                final FireworkSetData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireworkSetData buildPartial() {
                final FireworkSetData result = new FireworkSetData(this);
                final int from_bitField0_ = this.bitField0_;
                result.id_ = this.id_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.UnknownField_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.UnknownField_ = this.UnknownField_;
                if (this.fireWorkInstanceBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.fireWorkInstance_ = Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstance>)this.fireWorkInstance_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.fireWorkInstance_ = this.fireWorkInstance_;
                }
                else {
                    result.fireWorkInstance_ = this.fireWorkInstanceBuilder_.build();
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
                if (other instanceof FireworkSetData) {
                    return this.mergeFrom((FireworkSetData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireworkSetData other) {
                if (other == FireworkSetData.getDefaultInstance()) {
                    return this;
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (!other.UnknownField_.isEmpty()) {
                    if (this.UnknownField_.isEmpty()) {
                        this.UnknownField_ = other.UnknownField_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnknownFieldIsMutable();
                        this.UnknownField_.addAll(other.UnknownField_);
                    }
                    this.onChanged();
                }
                if (this.fireWorkInstanceBuilder_ == null) {
                    if (!other.fireWorkInstance_.isEmpty()) {
                        if (this.fireWorkInstance_.isEmpty()) {
                            this.fireWorkInstance_ = other.fireWorkInstance_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureFireWorkInstanceIsMutable();
                            this.fireWorkInstance_.addAll(other.fireWorkInstance_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.fireWorkInstance_.isEmpty()) {
                    if (this.fireWorkInstanceBuilder_.isEmpty()) {
                        this.fireWorkInstanceBuilder_.dispose();
                        this.fireWorkInstanceBuilder_ = null;
                        this.fireWorkInstance_ = other.fireWorkInstance_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.fireWorkInstanceBuilder_ = (FireworkSetData.alwaysUseFieldBuilders ? this.getFireWorkInstanceFieldBuilder() : null);
                    }
                    else {
                        this.fireWorkInstanceBuilder_.addAllMessages(other.fireWorkInstance_);
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
                FireworkSetData parsedMessage = null;
                try {
                    parsedMessage = FireworkSetData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireworkSetData)e.getUnfinishedMessage();
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
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnknownFieldIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.UnknownField_ = GeneratedMessageV3.mutableCopy(this.UnknownField_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnknownFieldList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.UnknownField_) : this.UnknownField_;
            }
            
            @Override
            public int getUnknownFieldCount() {
                return this.UnknownField_.size();
            }
            
            @Override
            public int getUnknownField(final int index) {
                return this.UnknownField_.getInt(index);
            }
            
            public Builder setUnknownField(final int index, final int value) {
                this.ensureUnknownFieldIsMutable();
                this.UnknownField_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnknownField(final int value) {
                this.ensureUnknownFieldIsMutable();
                this.UnknownField_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnknownField(final Iterable<? extends Integer> values) {
                this.ensureUnknownFieldIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.UnknownField_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnknownField() {
                this.UnknownField_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureFireWorkInstanceIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.fireWorkInstance_ = new ArrayList<FireWorkInstanceOuterClass.FireWorkInstance>(this.fireWorkInstance_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<FireWorkInstanceOuterClass.FireWorkInstance> getFireWorkInstanceList() {
                if (this.fireWorkInstanceBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstance>)this.fireWorkInstance_);
                }
                return this.fireWorkInstanceBuilder_.getMessageList();
            }
            
            @Override
            public int getFireWorkInstanceCount() {
                if (this.fireWorkInstanceBuilder_ == null) {
                    return this.fireWorkInstance_.size();
                }
                return this.fireWorkInstanceBuilder_.getCount();
            }
            
            @Override
            public FireWorkInstanceOuterClass.FireWorkInstance getFireWorkInstance(final int index) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    return this.fireWorkInstance_.get(index);
                }
                return this.fireWorkInstanceBuilder_.getMessage(index);
            }
            
            public Builder setFireWorkInstance(final int index, final FireWorkInstanceOuterClass.FireWorkInstance value) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFireWorkInstance(final int index, final FireWorkInstanceOuterClass.FireWorkInstance.Builder builderForValue) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFireWorkInstance(final FireWorkInstanceOuterClass.FireWorkInstance value) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.add(value);
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFireWorkInstance(final int index, final FireWorkInstanceOuterClass.FireWorkInstance value) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFireWorkInstance(final FireWorkInstanceOuterClass.FireWorkInstance.Builder builderForValue) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFireWorkInstance(final int index, final FireWorkInstanceOuterClass.FireWorkInstance.Builder builderForValue) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFireWorkInstance(final Iterable<? extends FireWorkInstanceOuterClass.FireWorkInstance> values) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.ensureFireWorkInstanceIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fireWorkInstance_);
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFireWorkInstance() {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.fireWorkInstance_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFireWorkInstance(final int index) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.ensureFireWorkInstanceIsMutable();
                    this.fireWorkInstance_.remove(index);
                    this.onChanged();
                }
                else {
                    this.fireWorkInstanceBuilder_.remove(index);
                }
                return this;
            }
            
            public FireWorkInstanceOuterClass.FireWorkInstance.Builder getFireWorkInstanceBuilder(final int index) {
                return this.getFireWorkInstanceFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder getFireWorkInstanceOrBuilder(final int index) {
                if (this.fireWorkInstanceBuilder_ == null) {
                    return this.fireWorkInstance_.get(index);
                }
                return this.fireWorkInstanceBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> getFireWorkInstanceOrBuilderList() {
                if (this.fireWorkInstanceBuilder_ != null) {
                    return this.fireWorkInstanceBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder>)this.fireWorkInstance_);
            }
            
            public FireWorkInstanceOuterClass.FireWorkInstance.Builder addFireWorkInstanceBuilder() {
                return this.getFireWorkInstanceFieldBuilder().addBuilder(FireWorkInstanceOuterClass.FireWorkInstance.getDefaultInstance());
            }
            
            public FireWorkInstanceOuterClass.FireWorkInstance.Builder addFireWorkInstanceBuilder(final int index) {
                return this.getFireWorkInstanceFieldBuilder().addBuilder(index, FireWorkInstanceOuterClass.FireWorkInstance.getDefaultInstance());
            }
            
            public List<FireWorkInstanceOuterClass.FireWorkInstance.Builder> getFireWorkInstanceBuilderList() {
                return this.getFireWorkInstanceFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FireWorkInstanceOuterClass.FireWorkInstance, FireWorkInstanceOuterClass.FireWorkInstance.Builder, FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> getFireWorkInstanceFieldBuilder() {
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.fireWorkInstanceBuilder_ = new RepeatedFieldBuilderV3<FireWorkInstanceOuterClass.FireWorkInstance, FireWorkInstanceOuterClass.FireWorkInstance.Builder, FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder>(this.fireWorkInstance_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.fireWorkInstance_ = null;
                }
                return this.fireWorkInstanceBuilder_;
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
    
    public interface FireworkSetDataOrBuilder extends MessageOrBuilder
    {
        int getId();
        
        List<Integer> getUnknownFieldList();
        
        int getUnknownFieldCount();
        
        int getUnknownField(final int p0);
        
        List<FireWorkInstanceOuterClass.FireWorkInstance> getFireWorkInstanceList();
        
        FireWorkInstanceOuterClass.FireWorkInstance getFireWorkInstance(final int p0);
        
        int getFireWorkInstanceCount();
        
        List<? extends FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> getFireWorkInstanceOrBuilderList();
        
        FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder getFireWorkInstanceOrBuilder(final int p0);
    }
}
