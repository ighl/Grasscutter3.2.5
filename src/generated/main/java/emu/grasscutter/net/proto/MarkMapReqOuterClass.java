// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Internal;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MarkMapReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_MarkMapReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MarkMapReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MarkMapReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MarkMapReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010MarkMapReq.proto\u001a\u0012MapMarkPoint.proto\"\u00c1\u0001\n\nMarkMapReq\u0012\u001b\n\u0004mark\u0018\u0007 \u0001(\u000b2\r.MapMarkPoint\u0012\u001a\n\u0003old\u0018\u000f \u0001(\u000b2\r.MapMarkPoint\u0012!\n\u0002op\u0018\n \u0001(\u000e2\u0015.MarkMapReq.Operation\"W\n\tOperation\u0012\u0011\n\rOPERATION_ADD\u0010\u0000\u0012\u0011\n\rOPERATION_MOD\u0010\u0001\u0012\u0011\n\rOPERATION_DEL\u0010\u0002\u0012\u0011\n\rOPERATION_GET\u0010\u0003B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MarkMapReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MapMarkPointOuterClass.getDescriptor() });
        internal_static_MarkMapReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MarkMapReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor, new String[] { "Mark", "Old", "Op" });
        MapMarkPointOuterClass.getDescriptor();
    }
    
    public static final class MarkMapReq extends GeneratedMessageV3 implements MarkMapReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MARK_FIELD_NUMBER = 7;
        private MapMarkPointOuterClass.MapMarkPoint mark_;
        public static final int OLD_FIELD_NUMBER = 15;
        private MapMarkPointOuterClass.MapMarkPoint old_;
        public static final int OP_FIELD_NUMBER = 10;
        private int op_;
        private byte memoizedIsInitialized;
        private static final MarkMapReq DEFAULT_INSTANCE;
        private static final Parser<MarkMapReq> PARSER;
        
        private MarkMapReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MarkMapReq() {
            this.memoizedIsInitialized = -1;
            this.op_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MarkMapReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MarkMapReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            MapMarkPointOuterClass.MapMarkPoint.Builder subBuilder = null;
                            if (this.mark_ != null) {
                                subBuilder = this.mark_.toBuilder();
                            }
                            this.mark_ = input.readMessage(MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.mark_);
                                this.mark_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 80: {
                            final int rawValue = input.readEnum();
                            this.op_ = rawValue;
                            continue;
                        }
                        case 122: {
                            MapMarkPointOuterClass.MapMarkPoint.Builder subBuilder = null;
                            if (this.old_ != null) {
                                subBuilder = this.old_.toBuilder();
                            }
                            this.old_ = input.readMessage(MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.old_);
                                this.old_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkMapReq.class, Builder.class);
        }
        
        @Override
        public boolean hasMark() {
            return this.mark_ != null;
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPoint getMark() {
            return (this.mark_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.mark_;
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
            return this.getMark();
        }
        
        @Override
        public boolean hasOld() {
            return this.old_ != null;
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPoint getOld() {
            return (this.old_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.old_;
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
            return this.getOld();
        }
        
        @Override
        public int getOpValue() {
            return this.op_;
        }
        
        @Override
        public Operation getOp() {
            final Operation result = Operation.valueOf(this.op_);
            return (result == null) ? Operation.UNRECOGNIZED : result;
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
            if (this.mark_ != null) {
                output.writeMessage(7, this.getMark());
            }
            if (this.op_ != Operation.OPERATION_ADD.getNumber()) {
                output.writeEnum(10, this.op_);
            }
            if (this.old_ != null) {
                output.writeMessage(15, this.getOld());
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
            if (this.mark_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getMark());
            }
            if (this.op_ != Operation.OPERATION_ADD.getNumber()) {
                size += CodedOutputStream.computeEnumSize(10, this.op_);
            }
            if (this.old_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getOld());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarkMapReq)) {
                return super.equals(obj);
            }
            final MarkMapReq other = (MarkMapReq)obj;
            return this.hasMark() == other.hasMark() && (!this.hasMark() || this.getMark().equals(other.getMark())) && this.hasOld() == other.hasOld() && (!this.hasOld() || this.getOld().equals(other.getOld())) && this.op_ == other.op_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMark()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getMark().hashCode();
            }
            if (this.hasOld()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getOld().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.op_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MarkMapReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data);
        }
        
        public static MarkMapReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data);
        }
        
        public static MarkMapReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data);
        }
        
        public static MarkMapReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapReq.PARSER, input);
        }
        
        public static MarkMapReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapReq.PARSER, input, extensionRegistry);
        }
        
        public static MarkMapReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkMapReq.PARSER, input);
        }
        
        public static MarkMapReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkMapReq.PARSER, input, extensionRegistry);
        }
        
        public static MarkMapReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapReq.PARSER, input);
        }
        
        public static MarkMapReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MarkMapReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MarkMapReq prototype) {
            return MarkMapReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MarkMapReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MarkMapReq getDefaultInstance() {
            return MarkMapReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<MarkMapReq> parser() {
            return MarkMapReq.PARSER;
        }
        
        @Override
        public Parser<MarkMapReq> getParserForType() {
            return MarkMapReq.PARSER;
        }
        
        @Override
        public MarkMapReq getDefaultInstanceForType() {
            return MarkMapReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MarkMapReq();
            PARSER = new AbstractParser<MarkMapReq>() {
                @Override
                public MarkMapReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MarkMapReq(input, extensionRegistry);
                }
            };
        }
        
        public enum Operation implements ProtocolMessageEnum
        {
            OPERATION_ADD(0), 
            OPERATION_MOD(1), 
            OPERATION_DEL(2), 
            OPERATION_GET(3), 
            UNRECOGNIZED(-1);
            
            public static final int OPERATION_ADD_VALUE = 0;
            public static final int OPERATION_MOD_VALUE = 1;
            public static final int OPERATION_DEL_VALUE = 2;
            public static final int OPERATION_GET_VALUE = 3;
            private static final Internal.EnumLiteMap<Operation> internalValueMap;
            private static final Operation[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == Operation.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static Operation valueOf(final int value) {
                return forNumber(value);
            }
            
            public static Operation forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return Operation.OPERATION_ADD;
                    }
                    case 1: {
                        return Operation.OPERATION_MOD;
                    }
                    case 2: {
                        return Operation.OPERATION_DEL;
                    }
                    case 3: {
                        return Operation.OPERATION_GET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<Operation> internalGetValueMap() {
                return Operation.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == Operation.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return MarkMapReq.getDescriptor().getEnumTypes().get(0);
            }
            
            public static Operation valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return Operation.UNRECOGNIZED;
                }
                return Operation.VALUES[desc.getIndex()];
            }
            
            private Operation(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ Operation[] value() {
                return new Operation[] { Operation.OPERATION_ADD, Operation.OPERATION_MOD, Operation.OPERATION_DEL, Operation.OPERATION_GET, Operation.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<Operation>() {
                    @Override
                    public Operation findValueByNumber(final int number) {
                        return Operation.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MarkMapReqOrBuilder
        {
            private MapMarkPointOuterClass.MapMarkPoint mark_;
            private SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> markBuilder_;
            private MapMarkPointOuterClass.MapMarkPoint old_;
            private SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> oldBuilder_;
            private int op_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkMapReq.class, Builder.class);
            }
            
            private Builder() {
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MarkMapReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.markBuilder_ == null) {
                    this.mark_ = null;
                }
                else {
                    this.mark_ = null;
                    this.markBuilder_ = null;
                }
                if (this.oldBuilder_ == null) {
                    this.old_ = null;
                }
                else {
                    this.old_ = null;
                    this.oldBuilder_ = null;
                }
                this.op_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
            }
            
            @Override
            public MarkMapReq getDefaultInstanceForType() {
                return MarkMapReq.getDefaultInstance();
            }
            
            @Override
            public MarkMapReq build() {
                final MarkMapReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MarkMapReq buildPartial() {
                final MarkMapReq result = new MarkMapReq(this);
                if (this.markBuilder_ == null) {
                    result.mark_ = this.mark_;
                }
                else {
                    result.mark_ = this.markBuilder_.build();
                }
                if (this.oldBuilder_ == null) {
                    result.old_ = this.old_;
                }
                else {
                    result.old_ = this.oldBuilder_.build();
                }
                result.op_ = this.op_;
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
                if (other instanceof MarkMapReq) {
                    return this.mergeFrom((MarkMapReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MarkMapReq other) {
                if (other == MarkMapReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasMark()) {
                    this.mergeMark(other.getMark());
                }
                if (other.hasOld()) {
                    this.mergeOld(other.getOld());
                }
                if (other.op_ != 0) {
                    this.setOpValue(other.getOpValue());
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
                MarkMapReq parsedMessage = null;
                try {
                    parsedMessage = MarkMapReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MarkMapReq)e.getUnfinishedMessage();
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
            public boolean hasMark() {
                return this.markBuilder_ != null || this.mark_ != null;
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPoint getMark() {
                if (this.markBuilder_ == null) {
                    return (this.mark_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.mark_;
                }
                return this.markBuilder_.getMessage();
            }
            
            public Builder setMark(final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.markBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.mark_ = value;
                    this.onChanged();
                }
                else {
                    this.markBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMark(final MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
                if (this.markBuilder_ == null) {
                    this.mark_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.markBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMark(final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.markBuilder_ == null) {
                    if (this.mark_ != null) {
                        this.mark_ = MapMarkPointOuterClass.MapMarkPoint.newBuilder(this.mark_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.mark_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.markBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMark() {
                if (this.markBuilder_ == null) {
                    this.mark_ = null;
                    this.onChanged();
                }
                else {
                    this.mark_ = null;
                    this.markBuilder_ = null;
                }
                return this;
            }
            
            public MapMarkPointOuterClass.MapMarkPoint.Builder getMarkBuilder() {
                this.onChanged();
                return this.getMarkFieldBuilder().getBuilder();
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
                if (this.markBuilder_ != null) {
                    return this.markBuilder_.getMessageOrBuilder();
                }
                return (this.mark_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.mark_;
            }
            
            private SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> getMarkFieldBuilder() {
                if (this.markBuilder_ == null) {
                    this.markBuilder_ = new SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>(this.getMark(), this.getParentForChildren(), this.isClean());
                    this.mark_ = null;
                }
                return this.markBuilder_;
            }
            
            @Override
            public boolean hasOld() {
                return this.oldBuilder_ != null || this.old_ != null;
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPoint getOld() {
                if (this.oldBuilder_ == null) {
                    return (this.old_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.old_;
                }
                return this.oldBuilder_.getMessage();
            }
            
            public Builder setOld(final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.oldBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.old_ = value;
                    this.onChanged();
                }
                else {
                    this.oldBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setOld(final MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
                if (this.oldBuilder_ == null) {
                    this.old_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.oldBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeOld(final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.oldBuilder_ == null) {
                    if (this.old_ != null) {
                        this.old_ = MapMarkPointOuterClass.MapMarkPoint.newBuilder(this.old_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.old_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.oldBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearOld() {
                if (this.oldBuilder_ == null) {
                    this.old_ = null;
                    this.onChanged();
                }
                else {
                    this.old_ = null;
                    this.oldBuilder_ = null;
                }
                return this;
            }
            
            public MapMarkPointOuterClass.MapMarkPoint.Builder getOldBuilder() {
                this.onChanged();
                return this.getOldFieldBuilder().getBuilder();
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
                if (this.oldBuilder_ != null) {
                    return this.oldBuilder_.getMessageOrBuilder();
                }
                return (this.old_ == null) ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : this.old_;
            }
            
            private SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> getOldFieldBuilder() {
                if (this.oldBuilder_ == null) {
                    this.oldBuilder_ = new SingleFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>(this.getOld(), this.getParentForChildren(), this.isClean());
                    this.old_ = null;
                }
                return this.oldBuilder_;
            }
            
            @Override
            public int getOpValue() {
                return this.op_;
            }
            
            public Builder setOpValue(final int value) {
                this.op_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Operation getOp() {
                final Operation result = Operation.valueOf(this.op_);
                return (result == null) ? Operation.UNRECOGNIZED : result;
            }
            
            public Builder setOp(final Operation value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.op_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOp() {
                this.op_ = 0;
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
    
    public interface MarkMapReqOrBuilder extends MessageOrBuilder
    {
        boolean hasMark();
        
        MapMarkPointOuterClass.MapMarkPoint getMark();
        
        MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder();
        
        boolean hasOld();
        
        MapMarkPointOuterClass.MapMarkPoint getOld();
        
        MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder();
        
        int getOpValue();
        
        MarkMapReq.Operation getOp();
    }
}
