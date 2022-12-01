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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class FireWorkDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FireWorkData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FireWorkData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FireWorkDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FireWorkDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012FireWorkData.proto\u001a\u0016FireWorkInstance.proto\"G\n\fFireWorkData\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012+\n\u0010fireWorkInstance\u0018\u0002 \u0003(\u000b2\u0011.FireWorkInstanceB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FireWorkDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FireWorkInstanceOuterClass.getDescriptor() });
        internal_static_FireWorkData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FireWorkData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FireWorkDataOuterClass.internal_static_FireWorkData_descriptor, new String[] { "Id", "FireWorkInstance" });
        FireWorkInstanceOuterClass.getDescriptor();
    }
    
    public static final class FireWorkData extends GeneratedMessageV3 implements FireWorkDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        public static final int FIREWORKINSTANCE_FIELD_NUMBER = 2;
        private List<FireWorkInstanceOuterClass.FireWorkInstance> fireWorkInstance_;
        private byte memoizedIsInitialized;
        private static final FireWorkData DEFAULT_INSTANCE;
        private static final Parser<FireWorkData> PARSER;
        
        private FireWorkData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FireWorkData() {
            this.memoizedIsInitialized = -1;
            this.fireWorkInstance_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FireWorkData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FireWorkData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fireWorkInstance_ = new ArrayList<FireWorkInstanceOuterClass.FireWorkInstance>();
                                mutable_bitField0_ |= 0x1;
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
                    this.fireWorkInstance_ = Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstance>)this.fireWorkInstance_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FireWorkDataOuterClass.internal_static_FireWorkData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FireWorkDataOuterClass.internal_static_FireWorkData_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkData.class, Builder.class);
        }
        
        @Override
        public int getId() {
            return this.id_;
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
            if (this.id_ != 0) {
                output.writeUInt32(1, this.id_);
            }
            for (int i = 0; i < this.fireWorkInstance_.size(); ++i) {
                output.writeMessage(2, this.fireWorkInstance_.get(i));
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
            for (int i = 0; i < this.fireWorkInstance_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.fireWorkInstance_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FireWorkData)) {
                return super.equals(obj);
            }
            final FireWorkData other = (FireWorkData)obj;
            return this.getId() == other.getId() && this.getFireWorkInstanceList().equals(other.getFireWorkInstanceList()) && this.unknownFields.equals(other.unknownFields);
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
            if (this.getFireWorkInstanceCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getFireWorkInstanceList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FireWorkData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data);
        }
        
        public static FireWorkData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data);
        }
        
        public static FireWorkData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data);
        }
        
        public static FireWorkData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FireWorkData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FireWorkData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkData.PARSER, input);
        }
        
        public static FireWorkData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkData.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkData.PARSER, input);
        }
        
        public static FireWorkData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FireWorkData.PARSER, input, extensionRegistry);
        }
        
        public static FireWorkData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkData.PARSER, input);
        }
        
        public static FireWorkData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FireWorkData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FireWorkData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FireWorkData prototype) {
            return FireWorkData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FireWorkData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FireWorkData getDefaultInstance() {
            return FireWorkData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FireWorkData> parser() {
            return FireWorkData.PARSER;
        }
        
        @Override
        public Parser<FireWorkData> getParserForType() {
            return FireWorkData.PARSER;
        }
        
        @Override
        public FireWorkData getDefaultInstanceForType() {
            return FireWorkData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FireWorkData();
            PARSER = new AbstractParser<FireWorkData>() {
                @Override
                public FireWorkData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FireWorkData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FireWorkDataOrBuilder
        {
            private int bitField0_;
            private int id_;
            private List<FireWorkInstanceOuterClass.FireWorkInstance> fireWorkInstance_;
            private RepeatedFieldBuilderV3<FireWorkInstanceOuterClass.FireWorkInstance, FireWorkInstanceOuterClass.FireWorkInstance.Builder, FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> fireWorkInstanceBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FireWorkDataOuterClass.internal_static_FireWorkData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FireWorkDataOuterClass.internal_static_FireWorkData_fieldAccessorTable.ensureFieldAccessorsInitialized(FireWorkData.class, Builder.class);
            }
            
            private Builder() {
                this.fireWorkInstance_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.fireWorkInstance_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FireWorkData.alwaysUseFieldBuilders) {
                    this.getFireWorkInstanceFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.id_ = 0;
                if (this.fireWorkInstanceBuilder_ == null) {
                    this.fireWorkInstance_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.fireWorkInstanceBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FireWorkDataOuterClass.internal_static_FireWorkData_descriptor;
            }
            
            @Override
            public FireWorkData getDefaultInstanceForType() {
                return FireWorkData.getDefaultInstance();
            }
            
            @Override
            public FireWorkData build() {
                final FireWorkData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FireWorkData buildPartial() {
                final FireWorkData result = new FireWorkData(this);
                final int from_bitField0_ = this.bitField0_;
                result.id_ = this.id_;
                if (this.fireWorkInstanceBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.fireWorkInstance_ = Collections.unmodifiableList((List<? extends FireWorkInstanceOuterClass.FireWorkInstance>)this.fireWorkInstance_);
                        this.bitField0_ &= 0xFFFFFFFE;
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
                if (other instanceof FireWorkData) {
                    return this.mergeFrom((FireWorkData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FireWorkData other) {
                if (other == FireWorkData.getDefaultInstance()) {
                    return this;
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
                }
                if (this.fireWorkInstanceBuilder_ == null) {
                    if (!other.fireWorkInstance_.isEmpty()) {
                        if (this.fireWorkInstance_.isEmpty()) {
                            this.fireWorkInstance_ = other.fireWorkInstance_;
                            this.bitField0_ &= 0xFFFFFFFE;
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
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.fireWorkInstanceBuilder_ = (FireWorkData.alwaysUseFieldBuilders ? this.getFireWorkInstanceFieldBuilder() : null);
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
                FireWorkData parsedMessage = null;
                try {
                    parsedMessage = FireWorkData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FireWorkData)e.getUnfinishedMessage();
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
            
            private void ensureFireWorkInstanceIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.fireWorkInstance_ = new ArrayList<FireWorkInstanceOuterClass.FireWorkInstance>(this.fireWorkInstance_);
                    this.bitField0_ |= 0x1;
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
                    this.bitField0_ &= 0xFFFFFFFE;
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
                    this.fireWorkInstanceBuilder_ = new RepeatedFieldBuilderV3<FireWorkInstanceOuterClass.FireWorkInstance, FireWorkInstanceOuterClass.FireWorkInstance.Builder, FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder>(this.fireWorkInstance_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
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
    
    public interface FireWorkDataOrBuilder extends MessageOrBuilder
    {
        int getId();
        
        List<FireWorkInstanceOuterClass.FireWorkInstance> getFireWorkInstanceList();
        
        FireWorkInstanceOuterClass.FireWorkInstance getFireWorkInstance(final int p0);
        
        int getFireWorkInstanceCount();
        
        List<? extends FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder> getFireWorkInstanceOrBuilderList();
        
        FireWorkInstanceOuterClass.FireWorkInstanceOrBuilder getFireWorkInstanceOrBuilder(final int p0);
    }
}
