// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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

public final class MaterialDeleteInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_CountDownDelete_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_CountDownDelete_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_DateTimeDelete_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MaterialDeleteInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MaterialDeleteInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018MaterialDeleteInfo.proto\"\u00ef\u0005\n\u0012MaterialDeleteInfo\u0012\u0019\n\u0011has_delete_config\u0018\u0001 \u0001(\b\u0012@\n\u0011count_down_delete\u0018\u0002 \u0001(\u000b2#.MaterialDeleteInfo.CountDownDeleteH\u0000\u00129\n\u000bdate_delete\u0018\u0003 \u0001(\u000b2\".MaterialDeleteInfo.DateTimeDeleteH\u0000\u0012T\n\u001cdelay_week_count_down_delete\u0018\u0004 \u0001(\u000b2,.MaterialDeleteInfo.DelayWeekCountDownDeleteH\u0000\u001a\u00c2\u0001\n\u000fCountDownDelete\u0012V\n\u0013delete_time_num_map\u0018\u0001 \u0003(\u000b29.MaterialDeleteInfo.CountDownDelete.DeleteTimeNumMapEntry\u0012\u001e\n\u0016config_count_down_time\u0018\u0002 \u0001(\r\u001a7\n\u0015DeleteTimeNumMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a%\n\u000eDateTimeDelete\u0012\u0013\n\u000bdelete_time\u0018\u0001 \u0001(\r\u001a\u00ef\u0001\n\u0018DelayWeekCountDownDelete\u0012_\n\u0013delete_time_num_map\u0018\u0001 \u0003(\u000b2B.MaterialDeleteInfo.DelayWeekCountDownDelete.DeleteTimeNumMapEntry\u0012\u0019\n\u0011config_delay_week\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016config_count_down_time\u0018\u0003 \u0001(\r\u001a7\n\u0015DeleteTimeNumMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\r\n\u000bdelete_infoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MaterialDeleteInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MaterialDeleteInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MaterialDeleteInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor, new String[] { "HasDeleteConfig", "CountDownDelete", "DateDelete", "DelayWeekCountDownDelete", "DeleteInfo" });
        internal_static_MaterialDeleteInfo_CountDownDelete_descriptor = MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor.getNestedTypes().get(0);
        internal_static_MaterialDeleteInfo_CountDownDelete_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_descriptor, new String[] { "DeleteTimeNumMap", "ConfigCountDownTime" });
        internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_descriptor = MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_descriptor.getNestedTypes().get(0);
        internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor = MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor.getNestedTypes().get(1);
        internal_static_MaterialDeleteInfo_DateTimeDelete_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor, new String[] { "DeleteTime" });
        internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor = MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor.getNestedTypes().get(2);
        internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor, new String[] { "DeleteTimeNumMap", "ConfigDelayWeek", "ConfigCountDownTime" });
        internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_descriptor = MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor.getNestedTypes().get(0);
        internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class MaterialDeleteInfo extends GeneratedMessageV3 implements MaterialDeleteInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int deleteInfoCase_;
        private Object deleteInfo_;
        public static final int HAS_DELETE_CONFIG_FIELD_NUMBER = 1;
        private boolean hasDeleteConfig_;
        public static final int COUNT_DOWN_DELETE_FIELD_NUMBER = 2;
        public static final int DATE_DELETE_FIELD_NUMBER = 3;
        public static final int DELAY_WEEK_COUNT_DOWN_DELETE_FIELD_NUMBER = 4;
        private byte memoizedIsInitialized;
        private static final MaterialDeleteInfo DEFAULT_INSTANCE;
        private static final Parser<MaterialDeleteInfo> PARSER;
        
        private MaterialDeleteInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deleteInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private MaterialDeleteInfo() {
            this.deleteInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MaterialDeleteInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MaterialDeleteInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.hasDeleteConfig_ = input.readBool();
                            continue;
                        }
                        case 18: {
                            CountDownDelete.Builder subBuilder = null;
                            if (this.deleteInfoCase_ == 2) {
                                subBuilder = ((CountDownDelete)this.deleteInfo_).toBuilder();
                            }
                            this.deleteInfo_ = input.readMessage(CountDownDelete.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((CountDownDelete)this.deleteInfo_);
                                this.deleteInfo_ = subBuilder.buildPartial();
                            }
                            this.deleteInfoCase_ = 2;
                            continue;
                        }
                        case 26: {
                            DateTimeDelete.Builder subBuilder2 = null;
                            if (this.deleteInfoCase_ == 3) {
                                subBuilder2 = ((DateTimeDelete)this.deleteInfo_).toBuilder();
                            }
                            this.deleteInfo_ = input.readMessage(DateTimeDelete.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((DateTimeDelete)this.deleteInfo_);
                                this.deleteInfo_ = subBuilder2.buildPartial();
                            }
                            this.deleteInfoCase_ = 3;
                            continue;
                        }
                        case 34: {
                            DelayWeekCountDownDelete.Builder subBuilder3 = null;
                            if (this.deleteInfoCase_ == 4) {
                                subBuilder3 = ((DelayWeekCountDownDelete)this.deleteInfo_).toBuilder();
                            }
                            this.deleteInfo_ = input.readMessage(DelayWeekCountDownDelete.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((DelayWeekCountDownDelete)this.deleteInfo_);
                                this.deleteInfo_ = subBuilder3.buildPartial();
                            }
                            this.deleteInfoCase_ = 4;
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
            return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialDeleteInfo.class, Builder.class);
        }
        
        @Override
        public DeleteInfoCase getDeleteInfoCase() {
            return DeleteInfoCase.forNumber(this.deleteInfoCase_);
        }
        
        @Override
        public boolean getHasDeleteConfig() {
            return this.hasDeleteConfig_;
        }
        
        @Override
        public boolean hasCountDownDelete() {
            return this.deleteInfoCase_ == 2;
        }
        
        @Override
        public CountDownDelete getCountDownDelete() {
            if (this.deleteInfoCase_ == 2) {
                return (CountDownDelete)this.deleteInfo_;
            }
            return CountDownDelete.getDefaultInstance();
        }
        
        @Override
        public CountDownDeleteOrBuilder getCountDownDeleteOrBuilder() {
            if (this.deleteInfoCase_ == 2) {
                return (CountDownDelete)this.deleteInfo_;
            }
            return CountDownDelete.getDefaultInstance();
        }
        
        @Override
        public boolean hasDateDelete() {
            return this.deleteInfoCase_ == 3;
        }
        
        @Override
        public DateTimeDelete getDateDelete() {
            if (this.deleteInfoCase_ == 3) {
                return (DateTimeDelete)this.deleteInfo_;
            }
            return DateTimeDelete.getDefaultInstance();
        }
        
        @Override
        public DateTimeDeleteOrBuilder getDateDeleteOrBuilder() {
            if (this.deleteInfoCase_ == 3) {
                return (DateTimeDelete)this.deleteInfo_;
            }
            return DateTimeDelete.getDefaultInstance();
        }
        
        @Override
        public boolean hasDelayWeekCountDownDelete() {
            return this.deleteInfoCase_ == 4;
        }
        
        @Override
        public DelayWeekCountDownDelete getDelayWeekCountDownDelete() {
            if (this.deleteInfoCase_ == 4) {
                return (DelayWeekCountDownDelete)this.deleteInfo_;
            }
            return DelayWeekCountDownDelete.getDefaultInstance();
        }
        
        @Override
        public DelayWeekCountDownDeleteOrBuilder getDelayWeekCountDownDeleteOrBuilder() {
            if (this.deleteInfoCase_ == 4) {
                return (DelayWeekCountDownDelete)this.deleteInfo_;
            }
            return DelayWeekCountDownDelete.getDefaultInstance();
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
            if (this.hasDeleteConfig_) {
                output.writeBool(1, this.hasDeleteConfig_);
            }
            if (this.deleteInfoCase_ == 2) {
                output.writeMessage(2, (MessageLite)this.deleteInfo_);
            }
            if (this.deleteInfoCase_ == 3) {
                output.writeMessage(3, (MessageLite)this.deleteInfo_);
            }
            if (this.deleteInfoCase_ == 4) {
                output.writeMessage(4, (MessageLite)this.deleteInfo_);
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
            if (this.hasDeleteConfig_) {
                size += CodedOutputStream.computeBoolSize(1, this.hasDeleteConfig_);
            }
            if (this.deleteInfoCase_ == 2) {
                size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.deleteInfo_);
            }
            if (this.deleteInfoCase_ == 3) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.deleteInfo_);
            }
            if (this.deleteInfoCase_ == 4) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.deleteInfo_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaterialDeleteInfo)) {
                return super.equals(obj);
            }
            final MaterialDeleteInfo other = (MaterialDeleteInfo)obj;
            if (this.getHasDeleteConfig() != other.getHasDeleteConfig()) {
                return false;
            }
            if (!this.getDeleteInfoCase().equals(other.getDeleteInfoCase())) {
                return false;
            }
            switch (this.deleteInfoCase_) {
                case 2: {
                    if (!this.getCountDownDelete().equals(other.getCountDownDelete())) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (!this.getDateDelete().equals(other.getDateDelete())) {
                        return false;
                    }
                    break;
                }
                case 4: {
                    if (!this.getDelayWeekCountDownDelete().equals(other.getDelayWeekCountDownDelete())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getHasDeleteConfig());
            switch (this.deleteInfoCase_) {
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getCountDownDelete().hashCode();
                    break;
                }
                case 3: {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getDateDelete().hashCode();
                    break;
                }
                case 4: {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + this.getDelayWeekCountDownDelete().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MaterialDeleteInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialDeleteInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialDeleteInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialDeleteInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialDeleteInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data);
        }
        
        public static MaterialDeleteInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MaterialDeleteInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MaterialDeleteInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialDeleteInfo.PARSER, input);
        }
        
        public static MaterialDeleteInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialDeleteInfo.PARSER, input, extensionRegistry);
        }
        
        public static MaterialDeleteInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MaterialDeleteInfo.PARSER, input);
        }
        
        public static MaterialDeleteInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MaterialDeleteInfo.PARSER, input, extensionRegistry);
        }
        
        public static MaterialDeleteInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialDeleteInfo.PARSER, input);
        }
        
        public static MaterialDeleteInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MaterialDeleteInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MaterialDeleteInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MaterialDeleteInfo prototype) {
            return MaterialDeleteInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MaterialDeleteInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MaterialDeleteInfo getDefaultInstance() {
            return MaterialDeleteInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MaterialDeleteInfo> parser() {
            return MaterialDeleteInfo.PARSER;
        }
        
        @Override
        public Parser<MaterialDeleteInfo> getParserForType() {
            return MaterialDeleteInfo.PARSER;
        }
        
        @Override
        public MaterialDeleteInfo getDefaultInstanceForType() {
            return MaterialDeleteInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MaterialDeleteInfo();
            PARSER = new AbstractParser<MaterialDeleteInfo>() {
                @Override
                public MaterialDeleteInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MaterialDeleteInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class CountDownDelete extends GeneratedMessageV3 implements CountDownDeleteOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int DELETE_TIME_NUM_MAP_FIELD_NUMBER = 1;
            private MapField<Integer, Integer> deleteTimeNumMap_;
            public static final int CONFIG_COUNT_DOWN_TIME_FIELD_NUMBER = 2;
            private int configCountDownTime_;
            private byte memoizedIsInitialized;
            private static final CountDownDelete DEFAULT_INSTANCE;
            private static final Parser<CountDownDelete> PARSER;
            
            private CountDownDelete(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private CountDownDelete() {
                this.memoizedIsInitialized = -1;
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new CountDownDelete();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private CountDownDelete(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 10: {
                                if ((mutable_bitField0_ & 0x1) == 0x0) {
                                    this.deleteTimeNumMap_ = MapField.newMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                                    mutable_bitField0_ |= 0x1;
                                }
                                final MapEntry<Integer, Integer> deleteTimeNumMap__ = input.readMessage(DeleteTimeNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                                this.deleteTimeNumMap_.getMutableMap().put(deleteTimeNumMap__.getKey(), deleteTimeNumMap__.getValue());
                                continue;
                            }
                            case 16: {
                                this.configCountDownTime_ = input.readUInt32();
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
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 1: {
                        return this.internalGetDeleteTimeNumMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(CountDownDelete.class, Builder.class);
            }
            
            private MapField<Integer, Integer> internalGetDeleteTimeNumMap() {
                if (this.deleteTimeNumMap_ == null) {
                    return MapField.emptyMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                }
                return this.deleteTimeNumMap_;
            }
            
            @Override
            public int getDeleteTimeNumMapCount() {
                return this.internalGetDeleteTimeNumMap().getMap().size();
            }
            
            @Override
            public boolean containsDeleteTimeNumMap(final int key) {
                return this.internalGetDeleteTimeNumMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getDeleteTimeNumMap() {
                return this.getDeleteTimeNumMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getDeleteTimeNumMapMap() {
                return this.internalGetDeleteTimeNumMap().getMap();
            }
            
            @Override
            public int getDeleteTimeNumMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getDeleteTimeNumMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            @Override
            public int getConfigCountDownTime() {
                return this.configCountDownTime_;
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
                GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetDeleteTimeNumMap(), DeleteTimeNumMapDefaultEntryHolder.defaultEntry, 1);
                if (this.configCountDownTime_ != 0) {
                    output.writeUInt32(2, this.configCountDownTime_);
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
                for (final Map.Entry<Integer, Integer> entry : this.internalGetDeleteTimeNumMap().getMap().entrySet()) {
                    final MapEntry<Integer, Integer> deleteTimeNumMap__ = DeleteTimeNumMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                    size += CodedOutputStream.computeMessageSize(1, deleteTimeNumMap__);
                }
                if (this.configCountDownTime_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.configCountDownTime_);
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CountDownDelete)) {
                    return super.equals(obj);
                }
                final CountDownDelete other = (CountDownDelete)obj;
                return this.internalGetDeleteTimeNumMap().equals(other.internalGetDeleteTimeNumMap()) && this.getConfigCountDownTime() == other.getConfigCountDownTime() && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                if (!this.internalGetDeleteTimeNumMap().getMap().isEmpty()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.internalGetDeleteTimeNumMap().hashCode();
                }
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getConfigCountDownTime();
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static CountDownDelete parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data);
            }
            
            public static CountDownDelete parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static CountDownDelete parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data);
            }
            
            public static CountDownDelete parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static CountDownDelete parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data);
            }
            
            public static CountDownDelete parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return CountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static CountDownDelete parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(CountDownDelete.PARSER, input);
            }
            
            public static CountDownDelete parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(CountDownDelete.PARSER, input, extensionRegistry);
            }
            
            public static CountDownDelete parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(CountDownDelete.PARSER, input);
            }
            
            public static CountDownDelete parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(CountDownDelete.PARSER, input, extensionRegistry);
            }
            
            public static CountDownDelete parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(CountDownDelete.PARSER, input);
            }
            
            public static CountDownDelete parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(CountDownDelete.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return CountDownDelete.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final CountDownDelete prototype) {
                return CountDownDelete.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == CountDownDelete.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static CountDownDelete getDefaultInstance() {
                return CountDownDelete.DEFAULT_INSTANCE;
            }
            
            public static Parser<CountDownDelete> parser() {
                return CountDownDelete.PARSER;
            }
            
            @Override
            public Parser<CountDownDelete> getParserForType() {
                return CountDownDelete.PARSER;
            }
            
            @Override
            public CountDownDelete getDefaultInstanceForType() {
                return CountDownDelete.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new CountDownDelete();
                PARSER = new AbstractParser<CountDownDelete>() {
                    @Override
                    public CountDownDelete parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new CountDownDelete(input, extensionRegistry);
                    }
                };
            }
            
            private static final class DeleteTimeNumMapDefaultEntryHolder
            {
                static final MapEntry<Integer, Integer> defaultEntry;
                
                static {
                    defaultEntry = MapEntry.newDefaultInstance(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_DeleteTimeNumMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
                }
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CountDownDeleteOrBuilder
            {
                private int bitField0_;
                private MapField<Integer, Integer> deleteTimeNumMap_;
                private int configCountDownTime_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_descriptor;
                }
                
                @Override
                protected MapField internalGetMapField(final int number) {
                    switch (number) {
                        case 1: {
                            return this.internalGetDeleteTimeNumMap();
                        }
                        default: {
                            throw new RuntimeException("Invalid map field number: " + number);
                        }
                    }
                }
                
                @Override
                protected MapField internalGetMutableMapField(final int number) {
                    switch (number) {
                        case 1: {
                            return this.internalGetMutableDeleteTimeNumMap();
                        }
                        default: {
                            throw new RuntimeException("Invalid map field number: " + number);
                        }
                    }
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(CountDownDelete.class, Builder.class);
                }
                
                private Builder() {
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (CountDownDelete.alwaysUseFieldBuilders) {}
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    this.internalGetMutableDeleteTimeNumMap().clear();
                    this.configCountDownTime_ = 0;
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_CountDownDelete_descriptor;
                }
                
                @Override
                public CountDownDelete getDefaultInstanceForType() {
                    return CountDownDelete.getDefaultInstance();
                }
                
                @Override
                public CountDownDelete build() {
                    final CountDownDelete result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public CountDownDelete buildPartial() {
                    final CountDownDelete result = new CountDownDelete(this);
                    final int from_bitField0_ = this.bitField0_;
                    (result.deleteTimeNumMap_ = this.internalGetDeleteTimeNumMap()).makeImmutable();
                    result.configCountDownTime_ = this.configCountDownTime_;
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
                    if (other instanceof CountDownDelete) {
                        return this.mergeFrom((CountDownDelete)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final CountDownDelete other) {
                    if (other == CountDownDelete.getDefaultInstance()) {
                        return this;
                    }
                    this.internalGetMutableDeleteTimeNumMap().mergeFrom(other.internalGetDeleteTimeNumMap());
                    if (other.getConfigCountDownTime() != 0) {
                        this.setConfigCountDownTime(other.getConfigCountDownTime());
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
                    CountDownDelete parsedMessage = null;
                    try {
                        parsedMessage = CountDownDelete.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (CountDownDelete)e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                    finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                
                private MapField<Integer, Integer> internalGetDeleteTimeNumMap() {
                    if (this.deleteTimeNumMap_ == null) {
                        return MapField.emptyMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                    }
                    return this.deleteTimeNumMap_;
                }
                
                private MapField<Integer, Integer> internalGetMutableDeleteTimeNumMap() {
                    this.onChanged();
                    if (this.deleteTimeNumMap_ == null) {
                        this.deleteTimeNumMap_ = MapField.newMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                    }
                    if (!this.deleteTimeNumMap_.isMutable()) {
                        this.deleteTimeNumMap_ = this.deleteTimeNumMap_.copy();
                    }
                    return this.deleteTimeNumMap_;
                }
                
                @Override
                public int getDeleteTimeNumMapCount() {
                    return this.internalGetDeleteTimeNumMap().getMap().size();
                }
                
                @Override
                public boolean containsDeleteTimeNumMap(final int key) {
                    return this.internalGetDeleteTimeNumMap().getMap().containsKey(key);
                }
                
                @Deprecated
                @Override
                public Map<Integer, Integer> getDeleteTimeNumMap() {
                    return this.getDeleteTimeNumMapMap();
                }
                
                @Override
                public Map<Integer, Integer> getDeleteTimeNumMapMap() {
                    return this.internalGetDeleteTimeNumMap().getMap();
                }
                
                @Override
                public int getDeleteTimeNumMapOrDefault(final int key, final int defaultValue) {
                    final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                    return map.containsKey(key) ? map.get(key) : defaultValue;
                }
                
                @Override
                public int getDeleteTimeNumMapOrThrow(final int key) {
                    final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                    if (!map.containsKey(key)) {
                        throw new IllegalArgumentException();
                    }
                    return map.get(key);
                }
                
                public Builder clearDeleteTimeNumMap() {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().clear();
                    return this;
                }
                
                public Builder removeDeleteTimeNumMap(final int key) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().remove(key);
                    return this;
                }
                
                @Deprecated
                public Map<Integer, Integer> getMutableDeleteTimeNumMap() {
                    return this.internalGetMutableDeleteTimeNumMap().getMutableMap();
                }
                
                public Builder putDeleteTimeNumMap(final int key, final int value) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().put(key, value);
                    return this;
                }
                
                public Builder putAllDeleteTimeNumMap(final Map<Integer, Integer> values) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().putAll(values);
                    return this;
                }
                
                @Override
                public int getConfigCountDownTime() {
                    return this.configCountDownTime_;
                }
                
                public Builder setConfigCountDownTime(final int value) {
                    this.configCountDownTime_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearConfigCountDownTime() {
                    this.configCountDownTime_ = 0;
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
        
        public static final class DateTimeDelete extends GeneratedMessageV3 implements DateTimeDeleteOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int DELETE_TIME_FIELD_NUMBER = 1;
            private int deleteTime_;
            private byte memoizedIsInitialized;
            private static final DateTimeDelete DEFAULT_INSTANCE;
            private static final Parser<DateTimeDelete> PARSER;
            
            private DateTimeDelete(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private DateTimeDelete() {
                this.memoizedIsInitialized = -1;
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new DateTimeDelete();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private DateTimeDelete(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 8: {
                                this.deleteTime_ = input.readUInt32();
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
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(DateTimeDelete.class, Builder.class);
            }
            
            @Override
            public int getDeleteTime() {
                return this.deleteTime_;
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
                if (this.deleteTime_ != 0) {
                    output.writeUInt32(1, this.deleteTime_);
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
                if (this.deleteTime_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(1, this.deleteTime_);
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DateTimeDelete)) {
                    return super.equals(obj);
                }
                final DateTimeDelete other = (DateTimeDelete)obj;
                return this.getDeleteTime() == other.getDeleteTime() && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getDeleteTime();
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static DateTimeDelete parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data);
            }
            
            public static DateTimeDelete parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DateTimeDelete parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data);
            }
            
            public static DateTimeDelete parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DateTimeDelete parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data);
            }
            
            public static DateTimeDelete parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DateTimeDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DateTimeDelete parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DateTimeDelete.PARSER, input);
            }
            
            public static DateTimeDelete parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DateTimeDelete.PARSER, input, extensionRegistry);
            }
            
            public static DateTimeDelete parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(DateTimeDelete.PARSER, input);
            }
            
            public static DateTimeDelete parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(DateTimeDelete.PARSER, input, extensionRegistry);
            }
            
            public static DateTimeDelete parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DateTimeDelete.PARSER, input);
            }
            
            public static DateTimeDelete parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DateTimeDelete.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return DateTimeDelete.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final DateTimeDelete prototype) {
                return DateTimeDelete.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == DateTimeDelete.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static DateTimeDelete getDefaultInstance() {
                return DateTimeDelete.DEFAULT_INSTANCE;
            }
            
            public static Parser<DateTimeDelete> parser() {
                return DateTimeDelete.PARSER;
            }
            
            @Override
            public Parser<DateTimeDelete> getParserForType() {
                return DateTimeDelete.PARSER;
            }
            
            @Override
            public DateTimeDelete getDefaultInstanceForType() {
                return DateTimeDelete.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new DateTimeDelete();
                PARSER = new AbstractParser<DateTimeDelete>() {
                    @Override
                    public DateTimeDelete parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new DateTimeDelete(input, extensionRegistry);
                    }
                };
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DateTimeDeleteOrBuilder
            {
                private int deleteTime_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor;
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(DateTimeDelete.class, Builder.class);
                }
                
                private Builder() {
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (DateTimeDelete.alwaysUseFieldBuilders) {}
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    this.deleteTime_ = 0;
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DateTimeDelete_descriptor;
                }
                
                @Override
                public DateTimeDelete getDefaultInstanceForType() {
                    return DateTimeDelete.getDefaultInstance();
                }
                
                @Override
                public DateTimeDelete build() {
                    final DateTimeDelete result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public DateTimeDelete buildPartial() {
                    final DateTimeDelete result = new DateTimeDelete(this);
                    result.deleteTime_ = this.deleteTime_;
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
                    if (other instanceof DateTimeDelete) {
                        return this.mergeFrom((DateTimeDelete)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final DateTimeDelete other) {
                    if (other == DateTimeDelete.getDefaultInstance()) {
                        return this;
                    }
                    if (other.getDeleteTime() != 0) {
                        this.setDeleteTime(other.getDeleteTime());
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
                    DateTimeDelete parsedMessage = null;
                    try {
                        parsedMessage = DateTimeDelete.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (DateTimeDelete)e.getUnfinishedMessage();
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
                public int getDeleteTime() {
                    return this.deleteTime_;
                }
                
                public Builder setDeleteTime(final int value) {
                    this.deleteTime_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearDeleteTime() {
                    this.deleteTime_ = 0;
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
        
        public static final class DelayWeekCountDownDelete extends GeneratedMessageV3 implements DelayWeekCountDownDeleteOrBuilder
        {
            private static final long serialVersionUID = 0L;
            public static final int DELETE_TIME_NUM_MAP_FIELD_NUMBER = 1;
            private MapField<Integer, Integer> deleteTimeNumMap_;
            public static final int CONFIG_DELAY_WEEK_FIELD_NUMBER = 2;
            private int configDelayWeek_;
            public static final int CONFIG_COUNT_DOWN_TIME_FIELD_NUMBER = 3;
            private int configCountDownTime_;
            private byte memoizedIsInitialized;
            private static final DelayWeekCountDownDelete DEFAULT_INSTANCE;
            private static final Parser<DelayWeekCountDownDelete> PARSER;
            
            private DelayWeekCountDownDelete(final GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }
            
            private DelayWeekCountDownDelete() {
                this.memoizedIsInitialized = -1;
            }
            
            @Override
            protected Object newInstance(final UnusedPrivateParameter unused) {
                return new DelayWeekCountDownDelete();
            }
            
            @Override
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }
            
            private DelayWeekCountDownDelete(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            case 10: {
                                if ((mutable_bitField0_ & 0x1) == 0x0) {
                                    this.deleteTimeNumMap_ = MapField.newMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                                    mutable_bitField0_ |= 0x1;
                                }
                                final MapEntry<Integer, Integer> deleteTimeNumMap__ = input.readMessage(DeleteTimeNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                                this.deleteTimeNumMap_.getMutableMap().put(deleteTimeNumMap__.getKey(), deleteTimeNumMap__.getValue());
                                continue;
                            }
                            case 16: {
                                this.configDelayWeek_ = input.readUInt32();
                                continue;
                            }
                            case 24: {
                                this.configCountDownTime_ = input.readUInt32();
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
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 1: {
                        return this.internalGetDeleteTimeNumMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(DelayWeekCountDownDelete.class, Builder.class);
            }
            
            private MapField<Integer, Integer> internalGetDeleteTimeNumMap() {
                if (this.deleteTimeNumMap_ == null) {
                    return MapField.emptyMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                }
                return this.deleteTimeNumMap_;
            }
            
            @Override
            public int getDeleteTimeNumMapCount() {
                return this.internalGetDeleteTimeNumMap().getMap().size();
            }
            
            @Override
            public boolean containsDeleteTimeNumMap(final int key) {
                return this.internalGetDeleteTimeNumMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getDeleteTimeNumMap() {
                return this.getDeleteTimeNumMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getDeleteTimeNumMapMap() {
                return this.internalGetDeleteTimeNumMap().getMap();
            }
            
            @Override
            public int getDeleteTimeNumMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getDeleteTimeNumMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            @Override
            public int getConfigDelayWeek() {
                return this.configDelayWeek_;
            }
            
            @Override
            public int getConfigCountDownTime() {
                return this.configCountDownTime_;
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
                GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetDeleteTimeNumMap(), DeleteTimeNumMapDefaultEntryHolder.defaultEntry, 1);
                if (this.configDelayWeek_ != 0) {
                    output.writeUInt32(2, this.configDelayWeek_);
                }
                if (this.configCountDownTime_ != 0) {
                    output.writeUInt32(3, this.configCountDownTime_);
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
                for (final Map.Entry<Integer, Integer> entry : this.internalGetDeleteTimeNumMap().getMap().entrySet()) {
                    final MapEntry<Integer, Integer> deleteTimeNumMap__ = DeleteTimeNumMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                    size += CodedOutputStream.computeMessageSize(1, deleteTimeNumMap__);
                }
                if (this.configDelayWeek_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(2, this.configDelayWeek_);
                }
                if (this.configCountDownTime_ != 0) {
                    size += CodedOutputStream.computeUInt32Size(3, this.configCountDownTime_);
                }
                size += this.unknownFields.getSerializedSize();
                return this.memoizedSize = size;
            }
            
            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DelayWeekCountDownDelete)) {
                    return super.equals(obj);
                }
                final DelayWeekCountDownDelete other = (DelayWeekCountDownDelete)obj;
                return this.internalGetDeleteTimeNumMap().equals(other.internalGetDeleteTimeNumMap()) && this.getConfigDelayWeek() == other.getConfigDelayWeek() && this.getConfigCountDownTime() == other.getConfigCountDownTime() && this.unknownFields.equals(other.unknownFields);
            }
            
            @Override
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                if (!this.internalGetDeleteTimeNumMap().getMap().isEmpty()) {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.internalGetDeleteTimeNumMap().hashCode();
                }
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getConfigDelayWeek();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getConfigCountDownTime();
                hash = 29 * hash + this.unknownFields.hashCode();
                return this.memoizedHashCode = hash;
            }
            
            public static DelayWeekCountDownDelete parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final ByteString data) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final byte[] data) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return DelayWeekCountDownDelete.PARSER.parseFrom(data, extensionRegistry);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DelayWeekCountDownDelete.PARSER, input);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DelayWeekCountDownDelete.PARSER, input, extensionRegistry);
            }
            
            public static DelayWeekCountDownDelete parseDelimitedFrom(final InputStream input) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(DelayWeekCountDownDelete.PARSER, input);
            }
            
            public static DelayWeekCountDownDelete parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseDelimitedWithIOException(DelayWeekCountDownDelete.PARSER, input, extensionRegistry);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final CodedInputStream input) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DelayWeekCountDownDelete.PARSER, input);
            }
            
            public static DelayWeekCountDownDelete parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                return GeneratedMessageV3.parseWithIOException(DelayWeekCountDownDelete.PARSER, input, extensionRegistry);
            }
            
            @Override
            public Builder newBuilderForType() {
                return newBuilder();
            }
            
            public static Builder newBuilder() {
                return DelayWeekCountDownDelete.DEFAULT_INSTANCE.toBuilder();
            }
            
            public static Builder newBuilder(final DelayWeekCountDownDelete prototype) {
                return DelayWeekCountDownDelete.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            
            @Override
            public Builder toBuilder() {
                return (this == DelayWeekCountDownDelete.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
            }
            
            @Override
            protected Builder newBuilderForType(final BuilderParent parent) {
                final Builder builder = new Builder(parent);
                return builder;
            }
            
            public static DelayWeekCountDownDelete getDefaultInstance() {
                return DelayWeekCountDownDelete.DEFAULT_INSTANCE;
            }
            
            public static Parser<DelayWeekCountDownDelete> parser() {
                return DelayWeekCountDownDelete.PARSER;
            }
            
            @Override
            public Parser<DelayWeekCountDownDelete> getParserForType() {
                return DelayWeekCountDownDelete.PARSER;
            }
            
            @Override
            public DelayWeekCountDownDelete getDefaultInstanceForType() {
                return DelayWeekCountDownDelete.DEFAULT_INSTANCE;
            }
            
            static {
                DEFAULT_INSTANCE = new DelayWeekCountDownDelete();
                PARSER = new AbstractParser<DelayWeekCountDownDelete>() {
                    @Override
                    public DelayWeekCountDownDelete parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new DelayWeekCountDownDelete(input, extensionRegistry);
                    }
                };
            }
            
            private static final class DeleteTimeNumMapDefaultEntryHolder
            {
                static final MapEntry<Integer, Integer> defaultEntry;
                
                static {
                    defaultEntry = MapEntry.newDefaultInstance(MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_DeleteTimeNumMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
                }
            }
            
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DelayWeekCountDownDeleteOrBuilder
            {
                private int bitField0_;
                private MapField<Integer, Integer> deleteTimeNumMap_;
                private int configDelayWeek_;
                private int configCountDownTime_;
                
                public static final Descriptors.Descriptor getDescriptor() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor;
                }
                
                @Override
                protected MapField internalGetMapField(final int number) {
                    switch (number) {
                        case 1: {
                            return this.internalGetDeleteTimeNumMap();
                        }
                        default: {
                            throw new RuntimeException("Invalid map field number: " + number);
                        }
                    }
                }
                
                @Override
                protected MapField internalGetMutableMapField(final int number) {
                    switch (number) {
                        case 1: {
                            return this.internalGetMutableDeleteTimeNumMap();
                        }
                        default: {
                            throw new RuntimeException("Invalid map field number: " + number);
                        }
                    }
                }
                
                @Override
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_fieldAccessorTable.ensureFieldAccessorsInitialized(DelayWeekCountDownDelete.class, Builder.class);
                }
                
                private Builder() {
                    this.maybeForceBuilderInitialization();
                }
                
                private Builder(final GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    this.maybeForceBuilderInitialization();
                }
                
                private void maybeForceBuilderInitialization() {
                    if (DelayWeekCountDownDelete.alwaysUseFieldBuilders) {}
                }
                
                @Override
                public Builder clear() {
                    super.clear();
                    this.internalGetMutableDeleteTimeNumMap().clear();
                    this.configDelayWeek_ = 0;
                    this.configCountDownTime_ = 0;
                    return this;
                }
                
                @Override
                public Descriptors.Descriptor getDescriptorForType() {
                    return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_DelayWeekCountDownDelete_descriptor;
                }
                
                @Override
                public DelayWeekCountDownDelete getDefaultInstanceForType() {
                    return DelayWeekCountDownDelete.getDefaultInstance();
                }
                
                @Override
                public DelayWeekCountDownDelete build() {
                    final DelayWeekCountDownDelete result = this.buildPartial();
                    if (!result.isInitialized()) {
                        throw AbstractMessage.Builder.newUninitializedMessageException(result);
                    }
                    return result;
                }
                
                @Override
                public DelayWeekCountDownDelete buildPartial() {
                    final DelayWeekCountDownDelete result = new DelayWeekCountDownDelete(this);
                    final int from_bitField0_ = this.bitField0_;
                    (result.deleteTimeNumMap_ = this.internalGetDeleteTimeNumMap()).makeImmutable();
                    result.configDelayWeek_ = this.configDelayWeek_;
                    result.configCountDownTime_ = this.configCountDownTime_;
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
                    if (other instanceof DelayWeekCountDownDelete) {
                        return this.mergeFrom((DelayWeekCountDownDelete)other);
                    }
                    super.mergeFrom(other);
                    return this;
                }
                
                public Builder mergeFrom(final DelayWeekCountDownDelete other) {
                    if (other == DelayWeekCountDownDelete.getDefaultInstance()) {
                        return this;
                    }
                    this.internalGetMutableDeleteTimeNumMap().mergeFrom(other.internalGetDeleteTimeNumMap());
                    if (other.getConfigDelayWeek() != 0) {
                        this.setConfigDelayWeek(other.getConfigDelayWeek());
                    }
                    if (other.getConfigCountDownTime() != 0) {
                        this.setConfigCountDownTime(other.getConfigCountDownTime());
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
                    DelayWeekCountDownDelete parsedMessage = null;
                    try {
                        parsedMessage = DelayWeekCountDownDelete.PARSER.parsePartialFrom(input, extensionRegistry);
                    }
                    catch (InvalidProtocolBufferException e) {
                        parsedMessage = (DelayWeekCountDownDelete)e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                    finally {
                        if (parsedMessage != null) {
                            this.mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                
                private MapField<Integer, Integer> internalGetDeleteTimeNumMap() {
                    if (this.deleteTimeNumMap_ == null) {
                        return MapField.emptyMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                    }
                    return this.deleteTimeNumMap_;
                }
                
                private MapField<Integer, Integer> internalGetMutableDeleteTimeNumMap() {
                    this.onChanged();
                    if (this.deleteTimeNumMap_ == null) {
                        this.deleteTimeNumMap_ = MapField.newMapField(DeleteTimeNumMapDefaultEntryHolder.defaultEntry);
                    }
                    if (!this.deleteTimeNumMap_.isMutable()) {
                        this.deleteTimeNumMap_ = this.deleteTimeNumMap_.copy();
                    }
                    return this.deleteTimeNumMap_;
                }
                
                @Override
                public int getDeleteTimeNumMapCount() {
                    return this.internalGetDeleteTimeNumMap().getMap().size();
                }
                
                @Override
                public boolean containsDeleteTimeNumMap(final int key) {
                    return this.internalGetDeleteTimeNumMap().getMap().containsKey(key);
                }
                
                @Deprecated
                @Override
                public Map<Integer, Integer> getDeleteTimeNumMap() {
                    return this.getDeleteTimeNumMapMap();
                }
                
                @Override
                public Map<Integer, Integer> getDeleteTimeNumMapMap() {
                    return this.internalGetDeleteTimeNumMap().getMap();
                }
                
                @Override
                public int getDeleteTimeNumMapOrDefault(final int key, final int defaultValue) {
                    final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                    return map.containsKey(key) ? map.get(key) : defaultValue;
                }
                
                @Override
                public int getDeleteTimeNumMapOrThrow(final int key) {
                    final Map<Integer, Integer> map = this.internalGetDeleteTimeNumMap().getMap();
                    if (!map.containsKey(key)) {
                        throw new IllegalArgumentException();
                    }
                    return map.get(key);
                }
                
                public Builder clearDeleteTimeNumMap() {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().clear();
                    return this;
                }
                
                public Builder removeDeleteTimeNumMap(final int key) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().remove(key);
                    return this;
                }
                
                @Deprecated
                public Map<Integer, Integer> getMutableDeleteTimeNumMap() {
                    return this.internalGetMutableDeleteTimeNumMap().getMutableMap();
                }
                
                public Builder putDeleteTimeNumMap(final int key, final int value) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().put(key, value);
                    return this;
                }
                
                public Builder putAllDeleteTimeNumMap(final Map<Integer, Integer> values) {
                    this.internalGetMutableDeleteTimeNumMap().getMutableMap().putAll(values);
                    return this;
                }
                
                @Override
                public int getConfigDelayWeek() {
                    return this.configDelayWeek_;
                }
                
                public Builder setConfigDelayWeek(final int value) {
                    this.configDelayWeek_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearConfigDelayWeek() {
                    this.configDelayWeek_ = 0;
                    this.onChanged();
                    return this;
                }
                
                @Override
                public int getConfigCountDownTime() {
                    return this.configCountDownTime_;
                }
                
                public Builder setConfigCountDownTime(final int value) {
                    this.configCountDownTime_ = value;
                    this.onChanged();
                    return this;
                }
                
                public Builder clearConfigCountDownTime() {
                    this.configCountDownTime_ = 0;
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
        
        public enum DeleteInfoCase implements Internal.EnumLite, InternalOneOfEnum
        {
            COUNT_DOWN_DELETE(2), 
            DATE_DELETE(3), 
            DELAY_WEEK_COUNT_DOWN_DELETE(4), 
            DELETEINFO_NOT_SET(0);
            
            private final int value;
            
            private DeleteInfoCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DeleteInfoCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DeleteInfoCase forNumber(final int value) {
                switch (value) {
                    case 2: {
                        return DeleteInfoCase.COUNT_DOWN_DELETE;
                    }
                    case 3: {
                        return DeleteInfoCase.DATE_DELETE;
                    }
                    case 4: {
                        return DeleteInfoCase.DELAY_WEEK_COUNT_DOWN_DELETE;
                    }
                    case 0: {
                        return DeleteInfoCase.DELETEINFO_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ DeleteInfoCase[] value() {
                return new DeleteInfoCase[] { DeleteInfoCase.COUNT_DOWN_DELETE, DeleteInfoCase.DATE_DELETE, DeleteInfoCase.DELAY_WEEK_COUNT_DOWN_DELETE, DeleteInfoCase.DELETEINFO_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MaterialDeleteInfoOrBuilder
        {
            private int deleteInfoCase_;
            private Object deleteInfo_;
            private boolean hasDeleteConfig_;
            private SingleFieldBuilderV3<CountDownDelete, CountDownDelete.Builder, CountDownDeleteOrBuilder> countDownDeleteBuilder_;
            private SingleFieldBuilderV3<DateTimeDelete, DateTimeDelete.Builder, DateTimeDeleteOrBuilder> dateDeleteBuilder_;
            private SingleFieldBuilderV3<DelayWeekCountDownDelete, DelayWeekCountDownDelete.Builder, DelayWeekCountDownDeleteOrBuilder> delayWeekCountDownDeleteBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialDeleteInfo.class, Builder.class);
            }
            
            private Builder() {
                this.deleteInfoCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.deleteInfoCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MaterialDeleteInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.hasDeleteConfig_ = false;
                this.deleteInfoCase_ = 0;
                this.deleteInfo_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MaterialDeleteInfoOuterClass.internal_static_MaterialDeleteInfo_descriptor;
            }
            
            @Override
            public MaterialDeleteInfo getDefaultInstanceForType() {
                return MaterialDeleteInfo.getDefaultInstance();
            }
            
            @Override
            public MaterialDeleteInfo build() {
                final MaterialDeleteInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MaterialDeleteInfo buildPartial() {
                final MaterialDeleteInfo result = new MaterialDeleteInfo(this);
                result.hasDeleteConfig_ = this.hasDeleteConfig_;
                if (this.deleteInfoCase_ == 2) {
                    if (this.countDownDeleteBuilder_ == null) {
                        result.deleteInfo_ = this.deleteInfo_;
                    }
                    else {
                        result.deleteInfo_ = this.countDownDeleteBuilder_.build();
                    }
                }
                if (this.deleteInfoCase_ == 3) {
                    if (this.dateDeleteBuilder_ == null) {
                        result.deleteInfo_ = this.deleteInfo_;
                    }
                    else {
                        result.deleteInfo_ = this.dateDeleteBuilder_.build();
                    }
                }
                if (this.deleteInfoCase_ == 4) {
                    if (this.delayWeekCountDownDeleteBuilder_ == null) {
                        result.deleteInfo_ = this.deleteInfo_;
                    }
                    else {
                        result.deleteInfo_ = this.delayWeekCountDownDeleteBuilder_.build();
                    }
                }
                result.deleteInfoCase_ = this.deleteInfoCase_;
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
                if (other instanceof MaterialDeleteInfo) {
                    return this.mergeFrom((MaterialDeleteInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MaterialDeleteInfo other) {
                if (other == MaterialDeleteInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getHasDeleteConfig()) {
                    this.setHasDeleteConfig(other.getHasDeleteConfig());
                }
                switch (other.getDeleteInfoCase()) {
                    case COUNT_DOWN_DELETE: {
                        this.mergeCountDownDelete(other.getCountDownDelete());
                        break;
                    }
                    case DATE_DELETE: {
                        this.mergeDateDelete(other.getDateDelete());
                        break;
                    }
                    case DELAY_WEEK_COUNT_DOWN_DELETE: {
                        this.mergeDelayWeekCountDownDelete(other.getDelayWeekCountDownDelete());
                        break;
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
                MaterialDeleteInfo parsedMessage = null;
                try {
                    parsedMessage = MaterialDeleteInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MaterialDeleteInfo)e.getUnfinishedMessage();
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
            public DeleteInfoCase getDeleteInfoCase() {
                return DeleteInfoCase.forNumber(this.deleteInfoCase_);
            }
            
            public Builder clearDeleteInfo() {
                this.deleteInfoCase_ = 0;
                this.deleteInfo_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getHasDeleteConfig() {
                return this.hasDeleteConfig_;
            }
            
            public Builder setHasDeleteConfig(final boolean value) {
                this.hasDeleteConfig_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHasDeleteConfig() {
                this.hasDeleteConfig_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasCountDownDelete() {
                return this.deleteInfoCase_ == 2;
            }
            
            @Override
            public CountDownDelete getCountDownDelete() {
                if (this.countDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 2) {
                        return (CountDownDelete)this.deleteInfo_;
                    }
                    return CountDownDelete.getDefaultInstance();
                }
                else {
                    if (this.deleteInfoCase_ == 2) {
                        return this.countDownDeleteBuilder_.getMessage();
                    }
                    return CountDownDelete.getDefaultInstance();
                }
            }
            
            public Builder setCountDownDelete(final CountDownDelete value) {
                if (this.countDownDeleteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.deleteInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.countDownDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 2;
                return this;
            }
            
            public Builder setCountDownDelete(final CountDownDelete.Builder builderForValue) {
                if (this.countDownDeleteBuilder_ == null) {
                    this.deleteInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.countDownDeleteBuilder_.setMessage(builderForValue.build());
                }
                this.deleteInfoCase_ = 2;
                return this;
            }
            
            public Builder mergeCountDownDelete(final CountDownDelete value) {
                if (this.countDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 2 && this.deleteInfo_ != CountDownDelete.getDefaultInstance()) {
                        this.deleteInfo_ = CountDownDelete.newBuilder((CountDownDelete)this.deleteInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.deleteInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.deleteInfoCase_ == 2) {
                        this.countDownDeleteBuilder_.mergeFrom(value);
                    }
                    this.countDownDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 2;
                return this;
            }
            
            public Builder clearCountDownDelete() {
                if (this.countDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 2) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.deleteInfoCase_ == 2) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                    }
                    this.countDownDeleteBuilder_.clear();
                }
                return this;
            }
            
            public CountDownDelete.Builder getCountDownDeleteBuilder() {
                return this.getCountDownDeleteFieldBuilder().getBuilder();
            }
            
            @Override
            public CountDownDeleteOrBuilder getCountDownDeleteOrBuilder() {
                if (this.deleteInfoCase_ == 2 && this.countDownDeleteBuilder_ != null) {
                    return this.countDownDeleteBuilder_.getMessageOrBuilder();
                }
                if (this.deleteInfoCase_ == 2) {
                    return (CountDownDelete)this.deleteInfo_;
                }
                return CountDownDelete.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<CountDownDelete, CountDownDelete.Builder, CountDownDeleteOrBuilder> getCountDownDeleteFieldBuilder() {
                if (this.countDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ != 2) {
                        this.deleteInfo_ = CountDownDelete.getDefaultInstance();
                    }
                    this.countDownDeleteBuilder_ = new SingleFieldBuilderV3<CountDownDelete, CountDownDelete.Builder, CountDownDeleteOrBuilder>((CountDownDelete)this.deleteInfo_, this.getParentForChildren(), this.isClean());
                    this.deleteInfo_ = null;
                }
                this.deleteInfoCase_ = 2;
                this.onChanged();
                return this.countDownDeleteBuilder_;
            }
            
            @Override
            public boolean hasDateDelete() {
                return this.deleteInfoCase_ == 3;
            }
            
            @Override
            public DateTimeDelete getDateDelete() {
                if (this.dateDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 3) {
                        return (DateTimeDelete)this.deleteInfo_;
                    }
                    return DateTimeDelete.getDefaultInstance();
                }
                else {
                    if (this.deleteInfoCase_ == 3) {
                        return this.dateDeleteBuilder_.getMessage();
                    }
                    return DateTimeDelete.getDefaultInstance();
                }
            }
            
            public Builder setDateDelete(final DateTimeDelete value) {
                if (this.dateDeleteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.deleteInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.dateDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 3;
                return this;
            }
            
            public Builder setDateDelete(final DateTimeDelete.Builder builderForValue) {
                if (this.dateDeleteBuilder_ == null) {
                    this.deleteInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.dateDeleteBuilder_.setMessage(builderForValue.build());
                }
                this.deleteInfoCase_ = 3;
                return this;
            }
            
            public Builder mergeDateDelete(final DateTimeDelete value) {
                if (this.dateDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 3 && this.deleteInfo_ != DateTimeDelete.getDefaultInstance()) {
                        this.deleteInfo_ = DateTimeDelete.newBuilder((DateTimeDelete)this.deleteInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.deleteInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.deleteInfoCase_ == 3) {
                        this.dateDeleteBuilder_.mergeFrom(value);
                    }
                    this.dateDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 3;
                return this;
            }
            
            public Builder clearDateDelete() {
                if (this.dateDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 3) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.deleteInfoCase_ == 3) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                    }
                    this.dateDeleteBuilder_.clear();
                }
                return this;
            }
            
            public DateTimeDelete.Builder getDateDeleteBuilder() {
                return this.getDateDeleteFieldBuilder().getBuilder();
            }
            
            @Override
            public DateTimeDeleteOrBuilder getDateDeleteOrBuilder() {
                if (this.deleteInfoCase_ == 3 && this.dateDeleteBuilder_ != null) {
                    return this.dateDeleteBuilder_.getMessageOrBuilder();
                }
                if (this.deleteInfoCase_ == 3) {
                    return (DateTimeDelete)this.deleteInfo_;
                }
                return DateTimeDelete.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<DateTimeDelete, DateTimeDelete.Builder, DateTimeDeleteOrBuilder> getDateDeleteFieldBuilder() {
                if (this.dateDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ != 3) {
                        this.deleteInfo_ = DateTimeDelete.getDefaultInstance();
                    }
                    this.dateDeleteBuilder_ = new SingleFieldBuilderV3<DateTimeDelete, DateTimeDelete.Builder, DateTimeDeleteOrBuilder>((DateTimeDelete)this.deleteInfo_, this.getParentForChildren(), this.isClean());
                    this.deleteInfo_ = null;
                }
                this.deleteInfoCase_ = 3;
                this.onChanged();
                return this.dateDeleteBuilder_;
            }
            
            @Override
            public boolean hasDelayWeekCountDownDelete() {
                return this.deleteInfoCase_ == 4;
            }
            
            @Override
            public DelayWeekCountDownDelete getDelayWeekCountDownDelete() {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 4) {
                        return (DelayWeekCountDownDelete)this.deleteInfo_;
                    }
                    return DelayWeekCountDownDelete.getDefaultInstance();
                }
                else {
                    if (this.deleteInfoCase_ == 4) {
                        return this.delayWeekCountDownDeleteBuilder_.getMessage();
                    }
                    return DelayWeekCountDownDelete.getDefaultInstance();
                }
            }
            
            public Builder setDelayWeekCountDownDelete(final DelayWeekCountDownDelete value) {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.deleteInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.delayWeekCountDownDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 4;
                return this;
            }
            
            public Builder setDelayWeekCountDownDelete(final DelayWeekCountDownDelete.Builder builderForValue) {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    this.deleteInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.delayWeekCountDownDeleteBuilder_.setMessage(builderForValue.build());
                }
                this.deleteInfoCase_ = 4;
                return this;
            }
            
            public Builder mergeDelayWeekCountDownDelete(final DelayWeekCountDownDelete value) {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 4 && this.deleteInfo_ != DelayWeekCountDownDelete.getDefaultInstance()) {
                        this.deleteInfo_ = DelayWeekCountDownDelete.newBuilder((DelayWeekCountDownDelete)this.deleteInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.deleteInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.deleteInfoCase_ == 4) {
                        this.delayWeekCountDownDeleteBuilder_.mergeFrom(value);
                    }
                    this.delayWeekCountDownDeleteBuilder_.setMessage(value);
                }
                this.deleteInfoCase_ = 4;
                return this;
            }
            
            public Builder clearDelayWeekCountDownDelete() {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ == 4) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.deleteInfoCase_ == 4) {
                        this.deleteInfoCase_ = 0;
                        this.deleteInfo_ = null;
                    }
                    this.delayWeekCountDownDeleteBuilder_.clear();
                }
                return this;
            }
            
            public DelayWeekCountDownDelete.Builder getDelayWeekCountDownDeleteBuilder() {
                return this.getDelayWeekCountDownDeleteFieldBuilder().getBuilder();
            }
            
            @Override
            public DelayWeekCountDownDeleteOrBuilder getDelayWeekCountDownDeleteOrBuilder() {
                if (this.deleteInfoCase_ == 4 && this.delayWeekCountDownDeleteBuilder_ != null) {
                    return this.delayWeekCountDownDeleteBuilder_.getMessageOrBuilder();
                }
                if (this.deleteInfoCase_ == 4) {
                    return (DelayWeekCountDownDelete)this.deleteInfo_;
                }
                return DelayWeekCountDownDelete.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<DelayWeekCountDownDelete, DelayWeekCountDownDelete.Builder, DelayWeekCountDownDeleteOrBuilder> getDelayWeekCountDownDeleteFieldBuilder() {
                if (this.delayWeekCountDownDeleteBuilder_ == null) {
                    if (this.deleteInfoCase_ != 4) {
                        this.deleteInfo_ = DelayWeekCountDownDelete.getDefaultInstance();
                    }
                    this.delayWeekCountDownDeleteBuilder_ = new SingleFieldBuilderV3<DelayWeekCountDownDelete, DelayWeekCountDownDelete.Builder, DelayWeekCountDownDeleteOrBuilder>((DelayWeekCountDownDelete)this.deleteInfo_, this.getParentForChildren(), this.isClean());
                    this.deleteInfo_ = null;
                }
                this.deleteInfoCase_ = 4;
                this.onChanged();
                return this.delayWeekCountDownDeleteBuilder_;
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
        
        public interface CountDownDeleteOrBuilder extends MessageOrBuilder
        {
            int getDeleteTimeNumMapCount();
            
            boolean containsDeleteTimeNumMap(final int p0);
            
            @Deprecated
            Map<Integer, Integer> getDeleteTimeNumMap();
            
            Map<Integer, Integer> getDeleteTimeNumMapMap();
            
            int getDeleteTimeNumMapOrDefault(final int p0, final int p1);
            
            int getDeleteTimeNumMapOrThrow(final int p0);
            
            int getConfigCountDownTime();
        }
        
        public interface DateTimeDeleteOrBuilder extends MessageOrBuilder
        {
            int getDeleteTime();
        }
        
        public interface DelayWeekCountDownDeleteOrBuilder extends MessageOrBuilder
        {
            int getDeleteTimeNumMapCount();
            
            boolean containsDeleteTimeNumMap(final int p0);
            
            @Deprecated
            Map<Integer, Integer> getDeleteTimeNumMap();
            
            Map<Integer, Integer> getDeleteTimeNumMapMap();
            
            int getDeleteTimeNumMapOrDefault(final int p0, final int p1);
            
            int getDeleteTimeNumMapOrThrow(final int p0);
            
            int getConfigDelayWeek();
            
            int getConfigCountDownTime();
        }
    }
    
    public interface MaterialDeleteInfoOrBuilder extends MessageOrBuilder
    {
        boolean getHasDeleteConfig();
        
        boolean hasCountDownDelete();
        
        MaterialDeleteInfo.CountDownDelete getCountDownDelete();
        
        MaterialDeleteInfo.CountDownDeleteOrBuilder getCountDownDeleteOrBuilder();
        
        boolean hasDateDelete();
        
        MaterialDeleteInfo.DateTimeDelete getDateDelete();
        
        MaterialDeleteInfo.DateTimeDeleteOrBuilder getDateDeleteOrBuilder();
        
        boolean hasDelayWeekCountDownDelete();
        
        MaterialDeleteInfo.DelayWeekCountDownDelete getDelayWeekCountDownDelete();
        
        MaterialDeleteInfo.DelayWeekCountDownDeleteOrBuilder getDelayWeekCountDownDeleteOrBuilder();
        
        MaterialDeleteInfo.DeleteInfoCase getDeleteInfoCase();
    }
}
